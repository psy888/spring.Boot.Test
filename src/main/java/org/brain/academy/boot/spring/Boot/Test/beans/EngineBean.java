package org.brain.academy.boot.spring.Boot.Test.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@RequiredArgsConstructor
@Component
public class EngineBean extends AbstractBean {
    @Value("${engine.modelName}")
    private String model;
    @Value("${engine.capacityVal}")
    private double capacity;
    private final List<String> props;
}
