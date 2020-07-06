package com.fan.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@EnableAsync
@Configuration
public class ThreadExecutorConfig {


    @Bean("taskExecutor")
    public AsyncTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//      线程池维护线程的最少数量
        executor.setCorePoolSize(10);
//      线程池维护线程的最大数量
        executor.setMaxPoolSize(30);
//      缓存队列
        executor.setQueueCapacity(10);
        executor.setThreadNamePrefix("taskExecutor-");
//      对拒绝task的处理策略
//      处理任务的优先级为：核心线程corePoolSize、任务队列workQueue、最大线程 maximumPoolSize，如果三者都满了，使用handler处理被拒绝的任务。
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//      允许的空闲时间
        executor.setKeepAliveSeconds(60);
        executor.initialize();
        return executor;
    }
}
