package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.File;

@Getter
@Setter
@ToString
public class MegliveVerifyRequest {
	
	
	private String uuid;
	
	@NotEmpty
	private File imageRef;
	
	private String delta;
	
	@NotBlank
	private File imageBest;
	
	private File[] imageAction;
	
	
}
