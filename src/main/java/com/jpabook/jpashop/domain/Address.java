package com.jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter // 변경되면 안되기 때문에 Setter는 제공하면 안된다.
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address(){ // JPA의 여러가지 기술이 쓰일때가 있는데 기본 생성자가 있어야만 해당 기술들을 쓸 수 있다.

    }
    public Address(String city, String street, String zipcode) {
        // 변경되면 안되기 때문에 Setter는 제공하면 안된다.
        // 값 설정을 생성자가 실행될 때 설정해주는게 BEST
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
