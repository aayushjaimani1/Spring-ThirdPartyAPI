package main.java.com.thirdparty.thirdparty.postService;

import java.util.List;
import java.util.Map;

public interface PostService {
    
    List<Map<String, Object>> getPosts();

    Map<String, Object> insertPosts(Map<String, Object> payload);

    Map<String, Object> updatePosts(Map<String, Object> payload, int id);
}
