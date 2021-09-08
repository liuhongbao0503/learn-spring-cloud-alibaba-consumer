package com.lhb.consumer.simplestconsumer.fegin;

import com.lhb.consumer.simplestconsumer.fegin.service.Impl.EchoServiceFallback;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }

}

