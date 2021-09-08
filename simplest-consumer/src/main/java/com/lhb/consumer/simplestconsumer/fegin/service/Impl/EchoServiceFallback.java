package com.lhb.consumer.simplestconsumer.fegin.service.Impl;

import com.lhb.consumer.simplestconsumer.fegin.service.EchoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(@PathVariable("str") String str) {
        return "echo fallback";
    }

    @Override
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        return "divide fallback";
    }

    @Override
    public String notFound() {
        return "notFound fallback";
    }

}
