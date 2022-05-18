package com.eggplantMarket.EggplantMarket.repository;

import com.eggplantMarket.EggplantMarket.entity.MemberInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberInterestRepository extends JpaRepository<MemberInterest, Long> {
}
