package com.fan.core.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Api body
 * @author tony
 * @param <T>
 */
@Getter
@Setter
@ToString
public class RestBody<T> extends RestHeader{
	private T data;
}
