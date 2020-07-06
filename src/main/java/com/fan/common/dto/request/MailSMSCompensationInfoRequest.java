package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailSMSCompensationInfoRequest {
    private String sign;
    private String type;
    private String mobile;
    private String message;
    private String sendTo;
    private String subject;
    private String text;
}
