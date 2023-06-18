/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.facebookapi.PostService;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Repository.PostRepo;

/**
 *
 * @author Enrique
 */
@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public ArrayList<Post> submitPostToDB(Post postData){
        postRepo.save(postData);
        ArrayList<Post> result = retrivePostFromDB();
        return result;
    }

    public ArrayList<Post> retrivePostFromDB(){
        ArrayList<Post> result = postRepo.findAll();
        return result;
    }

    public ArrayList<Post> deletePostFromDB(UUID postID){
        postRepo.deleteById(postID);
        ArrayList<Post> result = retrivePostFromDB();
        return result;
    }

}
