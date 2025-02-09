package com.mossab.customerservice.config;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "global.params")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class GlobalConfig{
    int p1;
    int p2;
}
