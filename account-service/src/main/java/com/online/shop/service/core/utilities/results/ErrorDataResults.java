package com.online.shop.service.core.utilities.results;

/**
 * Created By ->  ismalsagir on 26.01.23
 * Project Name -> online-shop-service
 */
public class ErrorDataResults <T> extends Results{

    T data;

    public ErrorDataResults(T data) {
        this.data = data;
    }

    public ErrorDataResults(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public ErrorDataResults(T data,String message) {
        super(message);
        this.data = data;
    }

    public ErrorDataResults( T data,boolean success) {
        super(success);
        this.data = data;
    }
}
