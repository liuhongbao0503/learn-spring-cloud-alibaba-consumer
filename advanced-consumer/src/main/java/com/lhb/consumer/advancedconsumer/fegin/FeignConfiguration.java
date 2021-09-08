package com.lhb.consumer.advancedconsumer.fegin;

import com.lhb.consumer.advancedconsumer.fegin.service.Impl.EchoServiceFallback;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }

}

