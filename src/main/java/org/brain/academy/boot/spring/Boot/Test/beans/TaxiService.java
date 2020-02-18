package org.brain.academy.boot.spring.Boot.Test.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class TaxiService {


    public void callTaxi(String name) {
        log.info("Call from {}", name);
    }

    public List<String> getList(String prefix) {
        return Arrays.asList(prefix + "qwerty", prefix+"qaz");
    }
}
