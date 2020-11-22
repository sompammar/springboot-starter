package com.example.springboot.dbservice;

import com.example.springboot.entity.Post;
import com.example.springboot.entity.User;

import java.util.List;

public interface IUserDBService {
    User saveUser(User user);
    List<Post> getPosts(String userId);
}
