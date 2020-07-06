package com.fan.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShortUrlRequestDto {
	
	private String oriUrl;
	
	private String shortUrl;

	private String sha1;
}
