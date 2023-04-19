package com.example.fashionapi14.Service;

import com.example.fashionapi14.Model.Post;

import java.util.List;

public interface PostService {

    Post savePost(Post post, Long id);

    List<Post> findAll();

    Post findById(Long id);

    Post updatePost(Long id, Post post);

    void deletePost(Long id, Long loggedInUserId);
}
