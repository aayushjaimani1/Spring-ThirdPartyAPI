package main.java.com.thirdparty.thirdparty.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdparty.thirdparty.postService.PostService;

@RestController
@RequestMapping("/api")
public class GetController {

    @Autowired
    private PostService postService;
    
    @GetMapping("/Getposts")
    List<Map<String, Object>> getAllPosts(){
        return postService.getPosts();
    }

    @PostMapping("/Postposts")
    Map<String, Object> getAllPosts(@RequestBody Map<String, Object> payload){
        return postService.insertPosts(payload);
    }

    @PutMapping("/updatePosts/{id}")
    Map<String, Object> updatePost(@RequestBody Map<String,Object> payload, @PathVariable int id){
        return postService.updatePosts(payload, id);
    }
}