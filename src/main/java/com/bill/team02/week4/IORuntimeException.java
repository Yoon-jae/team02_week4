package com.bill.team02.week4;

@SuppressWarnings("serial")
public class IORuntimeException extends Exception {
    private final int ERR_CODE;

    IORuntimeException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    IORuntimeException(String msg) {
        this(msg, 100);
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}