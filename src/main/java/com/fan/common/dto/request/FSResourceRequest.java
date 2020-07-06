package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author: weichen
 * @date: 2018/6/22
 */
@Getter
@Setter
@ToString
public class FSResourceRequest {
    private String base64Content;
    private String resourceType;
    private String scenario;
}
