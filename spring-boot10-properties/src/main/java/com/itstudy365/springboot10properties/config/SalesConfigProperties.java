package com.itstudy365.springboot10properties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "sales")
public class SalesConfigProperties {
    private String salesRegion;
    private int salesThreshold;

    public String getSalesRegion() {
        return salesRegion;
    }

    public void setSalesRegion(String salesRegion) {
        this.salesRegion = salesRegion;
    }

    public int getSalesThreshold() {
        return salesThreshold;
    }

    public void setSalesThreshold(int salesThreshold) {
        this.salesThreshold = salesThreshold;
    }
}
