package com.fan.core.concurrency;

public interface ConcurrencyProcessor<T> {

    T getThresholdValue();

    void setThresholdValue(T arg);

    void clearThresholdValue();
}
