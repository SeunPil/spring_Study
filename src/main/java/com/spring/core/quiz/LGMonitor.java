package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LGMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("LG모니터 입니다.");
    }
}
