package com.fan.core.locale;

import com.fan.core.concurrency.ConcurrencyProcessor;
import com.fan.core.interceptor.HeaderDeliveryInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

@Slf4j
@Configuration
public class LocaleConfig {

    @Bean
    public ConcurrencyProcessor localeConcurrencyProcessor(){
        log.info("init LocaleConcurrencyProcessor");
        return new ConcurrencyProcessor<Locale>() {

            @Override
            public Locale getThresholdValue() {
                log.info("LocaleConfig get:{}", LocaleContextHolder.getLocale());
                return LocaleContextHolder.getLocale();
            }

            @Override
            public void setThresholdValue(Locale locale) {
                if(locale!= null){
                    LocaleContextHolder.setLocale(locale);
                }
            }

            @Override
            public void clearThresholdValue() {
                LocaleContextHolder.setLocale(null);
            }
        };
    }

    @Bean
    @ConditionalOnMissingBean(name="localeHeaderDeliveryInterceptor")
    public HeaderDeliveryInterceptor localeServiceCallingInterceptor(){
        log.info("init LocaleServiceCallingInterceptor");
        return headers -> {
            log.info("feign intercept language: {}", LocaleContextHolder.getLocale());
            headers.put("Accept-Language", LocaleContextHolder.getLocale().getLanguage());
        };
    }


}
