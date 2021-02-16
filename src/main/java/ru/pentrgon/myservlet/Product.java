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

}
