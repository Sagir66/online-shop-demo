package com.online.shop.service.core.utilities.results;

/**
 * Created By ->  ismalsagir on 26.01.23
 * Project Name -> online-shop-service
 */
public class Results {

    private boolean success;
    private String message;

    public Results() {
    }

    public Results(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Results(String message) {
        this.message = message;
    }

    public Results(boolean success) {
        this.success = success;
    }
}
