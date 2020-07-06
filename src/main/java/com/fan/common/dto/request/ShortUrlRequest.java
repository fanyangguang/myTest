package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@ToString
public class ShortUrlRequest {

    @NotBlank
    private String longUrl;
}
