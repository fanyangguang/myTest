package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import java.io.File;

@Getter
@Setter
@ToString
public class DetectRequest {

	@NotBlank
	private File image;
}
