package com.fan.common.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CutImageRequest {

	private int x;
	private int y;
	private int width;
	private int height;
	private String srcPath;
	private String destPath;
}
