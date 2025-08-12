package com.example.project.controller.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "matchings")
public class Matching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userA;
    private String userB;

    // 기본 생성자 (JPA가 필요로 함)
    protected Matching() {}

    public Matching(String userA, String userB) {
        this.userA = userA;
        this.userB = userB;
    }

    public Long getId() {
        return id;
    }

    public String getUserA() {
        return userA;
    }

    public String getUserB() {
        return userB;
    }
}
