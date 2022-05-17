package com.eggplantMarket.EggplantMarket.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alarmId;

    @Column(nullable = false, length = 15)
    private String alarmText;

    @Column(nullable = false)
    private Boolean isView;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;
}
