package ru.pentrgon.myservlet;

import lombok.Data;
import lombok.NonNull;

@Data
public class Product {
    @NonNull
    private long id;
    @NonNull
    private String title;
    @NonNull
    private int cost;

    public Product(@NonNull long id, @NonNull String title, @NonNull int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
