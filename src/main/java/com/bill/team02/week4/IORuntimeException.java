package com.bill.team02.week4;

@SuppressWarnings("serial")
public class IORuntimeException extends Exception {
    private final int errCode;
    private static final int DEFAULTERR = 100;
    
    IORuntimeException(String msg, int perrCode) {
        super(msg);
        errCode = perrCode;
    }

    IORuntimeException(String msg) {
        this(msg, DEFAULTERR);
    }

    public int getErrCode() {
        return errCode;
    }
}