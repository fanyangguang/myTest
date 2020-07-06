package com.fan.core.security;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDetail {
    final public static String UID ="X-Auth-UID";
    private Long uid;
}
