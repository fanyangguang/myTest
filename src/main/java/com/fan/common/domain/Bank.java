package com.fan.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Bank domain model
 * @author tony
 *
 */
@Getter
@Setter
@ToString
public class Bank {
	
	private Long id;
	private String nation;
	private String code;
	private String name;
	private Integer accountLength;
	private String description;
	private String validateExpression;
	private String alias;
	private String imgUrl;

	private Date createdAt;
	private Date updatedAt;

}
