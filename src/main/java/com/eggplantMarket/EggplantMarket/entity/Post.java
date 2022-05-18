package com.eggplantMarket.EggplantMarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PostId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

    @Column(nullable = false, length = 15)
    private String postName;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDateTime lastModifiedDate;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String mainText;

    @Column(nullable = false)
    private int interest;

    @Column(nullable = false)
    private int chatting;

    @Column(nullable = false)
    private int views;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private Boolean isSell;


}
