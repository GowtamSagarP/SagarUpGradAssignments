package com.upgrad.ImageHoster.service;

import org.springframework.beans.factory.annotation.Autowired;

public class CommentService {

    @Autowired
    private CommentService commentService;

    @Autowired
    private TagService tagService;

    @Autowired
    private UserService userService;
}
