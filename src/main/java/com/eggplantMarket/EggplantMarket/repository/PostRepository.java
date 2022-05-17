package com.eggplantMarket.EggplantMarket.repository;

import com.eggplantMarket.EggplantMarket.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
