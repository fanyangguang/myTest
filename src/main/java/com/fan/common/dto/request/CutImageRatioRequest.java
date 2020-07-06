package com.fan.common.dto.request;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CutImageRatioRequest {

	private BigDecimal ratioX;
	private BigDecimal ratioY;
	private BigDecimal ratioWidth;
	private BigDecimal ratioHeight;
	private String srcPath;
	private String destPath;
}
