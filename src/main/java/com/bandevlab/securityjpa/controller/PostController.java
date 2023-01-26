/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bandevlab.securityjpa.controller;

import com.bandevlab.securityjpa.model.Post;
import com.bandevlab.securityjpa.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository posts;

    public PostController(PostRepository posts) {
        this.posts = posts;
    }

    @GetMapping
    public Iterable findAll() {
        return posts.findAll();
    }

    @GetMapping("{id}")
    public Post findById(@PathVariable("id") Post post) {
        return post;
    }

}
