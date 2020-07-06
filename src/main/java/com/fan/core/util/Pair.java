package com.fan.core.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pair<KEY,VALUE> {

    private KEY key;
    private VALUE value;
}
