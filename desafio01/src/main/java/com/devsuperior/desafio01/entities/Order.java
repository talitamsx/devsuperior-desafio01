package com.devsuperior.desafio01.entities;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private Integer code;
    private double basic;
    private double discount;

    public Order(){}

    public Order(Integer code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
