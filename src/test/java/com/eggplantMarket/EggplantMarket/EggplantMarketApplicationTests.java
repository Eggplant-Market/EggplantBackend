package com.eggplantMarket.EggplantMarket;

import com.eggplantMarket.EggplantMarket.repository.PostRepository;
import com.eggplantMarket.EggplantMarket.service.ViewPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EggplantMarketApplicationTests {

	@Autowired
	PostRepository postRepository;
	@Autowired
	ViewPostService viewPostService;

	@Test
	void contextLoads() {
		viewPostService.findPost();

	}

}
