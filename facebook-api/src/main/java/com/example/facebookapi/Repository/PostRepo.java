/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


import com.example.facebookapi.Entity.Post;
/**
 *
 * @author Enrique
 */
@Repository
public interface PostRepo extends CassandraRepository<Post,UUID>{
    ArrayList<Post> findAll();
    Post save(Post post);
    void deleteById(UUID postID);

}
