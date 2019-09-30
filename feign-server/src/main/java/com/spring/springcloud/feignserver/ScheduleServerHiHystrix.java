package com.spring.springcloud.feignserver;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServerHiHystrix implements ScheduleServerHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}