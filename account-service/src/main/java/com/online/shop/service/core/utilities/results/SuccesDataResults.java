package com.online.shop.service.core.utilities.results;

import com.online.shop.service.core.utilities.results.Results;

/**
 * Created By ->  ismalsagir on 26.01.23
 * Project Name -> online-shop-service
 */
public class SuccesDataResults <T> extends Results {

    T data;

    public SuccesDataResults(T data) {
        this.data = data;
    }

    public SuccesDataResults(T data,boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public SuccesDataResults(T data,String message) {
        super(message);
        this.data = data;
    }

    public SuccesDataResults(T data, boolean success) {
        super(success);
        this.data = data;
    }
}
