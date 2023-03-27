package com.example.northwind.core.utilities.result;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult() {
        super(null, false);
    }

    public ErrorDataResult(T data, String message) {
        super(data, false, message);
    }

    public ErrorDataResult(T data) {
        super(data, false);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

}
