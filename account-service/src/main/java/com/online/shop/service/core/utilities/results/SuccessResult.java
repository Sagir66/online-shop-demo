package com.online.shop.service.core.utilities.results;

import com.online.shop.service.core.utilities.results.Results;

/**
 * Created By ->  ismalsagir on 26.01.23
 * Project Name -> online-shop-service
 */
public class SuccessResult extends Results {

    public SuccessResult() {
    }

    public SuccessResult(boolean success, String message) {
        super(success, message);
    }

    public SuccessResult(String message) {
        super(message);
    }

    public SuccessResult(boolean success) {
        super(success);
    }
}
