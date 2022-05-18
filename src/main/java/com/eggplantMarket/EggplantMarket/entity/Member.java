package com.eggplantMarket.EggplantMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
