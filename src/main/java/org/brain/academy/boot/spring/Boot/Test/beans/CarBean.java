package org.brain.academy.boot.spring.Boot.Test.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
public class CarBean extends AbstractBean {
    private EngineBean engineBean;
    private TaxiService taxiService;


}
