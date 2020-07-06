package com.fan.common.dto.request;

import lombok.Data;

@Data
public class ShortLinkRequest {
    private String key;
    private String _accountID;
    private String _phone;
}
