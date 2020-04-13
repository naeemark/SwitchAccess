package com.example.demo.utils;

import com.example.demo.model.AccessRequest;
import com.example.demo.model.Feature;
import com.example.demo.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashSet;

public class TestDataFactory {

    public static User getSingleUser(Integer id, String email){
        return new User(id, email, new HashSet<>());
    }

    public static Feature getSingleFeature(Integer id, String name){
        return new Feature(id, name);
    }


    public static AccessRequest getAccessRequest(String email, String featureName, boolean enable){
        return new AccessRequest(email, featureName, enable);
    }

    public static String asJsonString(Object object){
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
