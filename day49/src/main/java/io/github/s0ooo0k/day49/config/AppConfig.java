package io.github.s0ooo0k.day49.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 본인의 패키지명 중에 가장 좁히는 범위
@ComponentScan(basePackages = "io.github.s0ooo0k.day49")
public class AppConfig {
    // 빈(Bean)
}