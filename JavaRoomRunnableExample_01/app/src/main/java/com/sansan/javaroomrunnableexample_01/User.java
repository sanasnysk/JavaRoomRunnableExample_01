package com.sansan.javaroomrunnableexample_01;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_tbl")
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="title")
    public String title;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "ones")
    public int ones;

    public User(int id, String title, String name, int ones) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.ones = ones;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }
}
