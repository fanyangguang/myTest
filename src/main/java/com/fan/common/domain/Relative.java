package com.fan.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Relative implements Serializable {

    private static final long serialVersionUID = -8825854061121161285L;

    private Long id;

    private Long accountId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String name;

    private String gender;

    private String mobile;

    private Date birthday;

    private String email;

    private String districtAddress;

    private String streetAddress;

    private String company;

    private String relationship;

    private String type;

    private Date createdAt;

    private Date updatedAt;

    private String districtAddressCode;

    private String genderCode;

    private String relationshipCode;
}
