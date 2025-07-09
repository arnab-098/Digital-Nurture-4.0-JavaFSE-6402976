package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country() {
        LOGGER.debug("Inside Country constructor");
    }

    public String getName() {
        LOGGER.debug("Getter method getName() called");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Setter method setName() called");
        this.name = name;
    }

    public String getCode() {
        LOGGER.debug("Getter method getCode() called");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Setter method setCode() called");
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
