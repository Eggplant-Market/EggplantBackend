package com.eggplantMarket.EggplantMarket.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false, unique = true, length = 10)
    private String userid;

    @Column(nullable = false, unique = true, length = 10)
    private String username;

    @Column(nullable = false, length = 15)
    private String password;

    @Column(nullable = false, length = 10)
    private String nickname;

    @Column(nullable = true)
    private String location;

    @Column(nullable = true)
    private String image;
}
