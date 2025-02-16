package com.sansan.javaroomrunnableexample_01;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user_tbl")
    List<User> getAll();

    @Query("SELECT * FROM user_tbl WHERE id IN (:musicIds)")
    List<User> loadAllByIds(int[] musicIds);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User music);

}
