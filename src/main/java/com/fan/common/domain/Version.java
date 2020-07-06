package com.fan.common.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Version{

    private Long id;

    private String version;

    private String nation;

    private Integer forceUpdate;

    private String href;

    private String platform;

    private String description;

    private Date createdAt;

    private Date updatedAt;
}
