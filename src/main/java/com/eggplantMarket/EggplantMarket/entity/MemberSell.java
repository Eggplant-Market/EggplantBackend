package com.eggplantMarket.EggplantMarket.entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class MemberSell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberSellId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;
}
