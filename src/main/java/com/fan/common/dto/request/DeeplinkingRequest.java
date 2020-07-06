package com.fan.common.dto.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class DeeplinkingRequest {
    @NotBlank
    private String queryItem;
}
