package com.eggplantMarket.EggplantMarket.repository;

import com.eggplantMarket.EggplantMarket.entity.MemberSell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSellRepository extends JpaRepository<MemberSell, Long> {
}
