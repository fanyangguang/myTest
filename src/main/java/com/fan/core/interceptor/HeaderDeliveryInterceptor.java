package com.fan.core.interceptor;

import java.util.Map;


public interface HeaderDeliveryInterceptor {

    void makeup(Map<String, String> headers);
}
