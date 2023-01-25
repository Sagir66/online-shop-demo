package com.online.shop.service.core.utilities.results;

/**
 * Created By ->  ismalsagir on 26.01.23
 * Project Name -> online-shop-service
 */
public class ErrorResult extends Results {

    public ErrorResult() {
    }

    public ErrorResult(boolean success, String message) {
        super(success, message);
    }

    public ErrorResult(String message) {
        super(message);
    }

    public ErrorResult(boolean success) {
        super(success);
    }
}
