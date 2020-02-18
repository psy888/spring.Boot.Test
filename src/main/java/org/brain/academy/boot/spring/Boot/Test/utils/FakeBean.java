package org.brain.academy.boot.spring.Boot.Test.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FakeBean {
    public FakeBean() {
        log.info("Hello");
    }
}
