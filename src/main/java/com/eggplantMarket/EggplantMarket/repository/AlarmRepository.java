package com.eggplantMarket.EggplantMarket.repository;

import com.eggplantMarket.EggplantMarket.entity.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepository extends JpaRepository<Alarm, Long> {
}
