package com.jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    // 연관관계에서 종속된 것으로 선언, Order테이블에서 member에 의해 control됨
    // -> 이것을 안하면 JPA가 Member랑 Order 둘중에 값을 변경했을 때 뭘 기준으로 해야할지 헷갈려함
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
