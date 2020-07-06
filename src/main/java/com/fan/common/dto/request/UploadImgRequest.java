package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@ToString
public class UploadImgRequest {

    @NotBlank(message = "i18n:1036")
    private String base64Img;
}
