package com.online.shop.service.core.utilities.results;

public class DataResult<T> extends Results {

    T data;

    public DataResult(T data) {
        this.data = data;
    }

    public DataResult(T data,boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public DataResult(T data,String message) {
        super(message);
        this.data = data;
    }

    public DataResult(T data,boolean success) {
        super(success);
        this.data = data;
    }
}
