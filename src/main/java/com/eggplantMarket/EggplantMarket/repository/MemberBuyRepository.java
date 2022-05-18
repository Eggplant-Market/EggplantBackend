package com.eggplantMarket.EggplantMarket.repository;

import com.eggplantMarket.EggplantMarket.entity.MemberBuy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberBuyRepository extends JpaRepository<MemberBuy, Long> {
}
