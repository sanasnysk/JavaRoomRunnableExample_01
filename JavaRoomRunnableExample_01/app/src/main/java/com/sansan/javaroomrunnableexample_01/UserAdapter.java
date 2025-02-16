package com.sansan.javaroomrunnableexample_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViweHolder> {

    private List<User> userList;
    public UserAdapter(List<User> list){
        userList = list;
    }

    @NonNull
    @Override
    public ViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.user_item, parent, false);
        UserAdapter.ViweHolder user_view = new  UserAdapter.ViweHolder(view);
        return user_view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViweHolder holder, int position) {
        User user_item = userList.get(position);
        holder.title.setText(user_item.title);
        holder.name.setText(user_item.name);
        holder.ones.setText(user_item.ones);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public static class ViweHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView name;
        TextView ones;

        public ViweHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_title);
            name = itemView.findViewById(R.id.txt_name);
            ones = itemView.findViewById(R.id.txt_ones);
        }
    }
}
