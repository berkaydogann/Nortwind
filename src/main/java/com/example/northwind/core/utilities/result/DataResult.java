package com.example.northwind.core.utilities.result;

public class DataResult<T> extends Result {
    public DataResult(T data, boolean success, String message) {
        super(success, message);
    }
}
