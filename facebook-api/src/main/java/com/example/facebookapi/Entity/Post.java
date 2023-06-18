package com.example.facebookapi.Entity;

import java.util.UUID;
import java.security.Timestamp;

import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
@Table
public class Post {

        @PrimaryKey
        private UUID postID;
        private UUID userID;
        private String userName;
        private String imageURL;
        private String description;
        private int likes;
        private Timestamp dateTime;
        
        public Post(UUID postID, UUID userID, String userName, String imageURL, String description, int likes, Timestamp dateTime){
            super();
            this.postID = postID;
            this.userID = userID;
            this.userName = userName;
            this.imageURL = imageURL;
            this.description = description;
            this.likes = likes;
            this.dateTime = dateTime;
        }
        
        public UUID getPostID() {
        return this.postID;
    }

    public void setPostID(UUID postID) {
        this.postID = postID;
    }

    public UUID getUserID() {
        return this.userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Timestamp getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
        
}
