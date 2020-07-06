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
public class RawImageVerifyRequest {
	
	
	private String uuid;
	
	@NotEmpty
	private File imageRef;
	
	@NotBlank
	private File image;
	
	private String failWhenMultipleFaces;
	
	private String faceQualityThreshold;
	
	private String returnFaces;
	
	
}
