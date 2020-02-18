package org.brain.academy.boot.spring.Boot.Test.beans;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class ConfigBean {
    private TaxiService taxiService;

    @Bean
    List<String> props(){
        return taxiService.getList("My");
    }
}
