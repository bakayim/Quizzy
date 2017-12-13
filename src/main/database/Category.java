package main.database;

import java.util.*;

public class Category {
    private int id;
    private String name;
    private Date timestamp;

    public Category(int id, String name, Date timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public static List<Category> getAll() {
        return Api.getAllCategories();
    }

    public String getName() {
        return name;
    }
}
