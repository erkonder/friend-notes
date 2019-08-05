package com.example.friendnotes.controller;


import com.example.friendnotes.exception.ResourceNotFoundException;
import com.example.friendnotes.model.Friend;

import com.example.friendnotes.repository.FriendRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FriendController {

    @Autowired
    FriendRepository friendRepository;

    //Get All Friends
    @GetMapping("/friends")
    public List<Friend> getAllFriends()
    {
        return  friendRepository.findAll();
    }

    // Create a new Friend
    @PostMapping("/friends")
    public Friend createNote(@Valid @RequestBody Friend friend) {
        return friendRepository.save(friend);
    }






}
