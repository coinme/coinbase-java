package com.coinbase.v1.entity;

public class OAuthCodeResponse extends Response {
    private static final long serialVersionUID = -594668473446848581L;
    
    private String _code;

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }
}
