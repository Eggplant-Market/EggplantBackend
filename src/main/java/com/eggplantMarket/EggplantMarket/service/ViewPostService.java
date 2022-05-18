package com.eggplantMarket.EggplantMarket.service;

import com.eggplantMarket.EggplantMarket.entity.Post;
import com.eggplantMarket.EggplantMarket.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewPostService {

    private final PostRepository postRepository;

    public ViewPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findPost(){
        return postRepository.findAll();
    }
}
