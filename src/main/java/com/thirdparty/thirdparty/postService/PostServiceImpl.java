package main.java.com.thirdparty.thirdparty.postService;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.val;

@Service
public class PostServiceImpl implements PostService{

    String baseUrl = "https://jsonplaceholder.typicode.com";

    StringBuilder sb = new StringBuilder(baseUrl);

    String GET = "/posts";

    String GETBYID = "/posts/";

    @Override
    public List<Map<String, Object>> getPosts() {
        HttpEntity<Void> httpEntity = new HttpEntity<>(gethttpHeaders());
        String url = sb.append(GET).toString();
        val response = restTemplate.exchange(url,HttpMethod.GET, httpEntity, List.class);
        return response.getBody();
    }

    private HttpHeaders gethttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    @Override
    public Map<String, Object> insertPosts(Map<String, Object> payload) {
        HttpEntity <Map> httpEntity = new HttpEntity<>(payload,gethttpHeaders());
        String url = sb.append(GET).toString();
        val response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, Map.class);
        return response.getBody();
    }

    @Override
    // public Map<String, Object> updatePosts(Map<String, Object> payload, int id) {
    //     HttpEntity <Map> httpEntity = new HttpEntity<>(payload,gethttpHeaders());
    //     String url = sb.append(GETBYID).append(id).toString();
    //     val response = restTemplate.exchange(url, HttpMethod.PUT, httpEntity, Map.class);
    //     return response.getBody();
    // }
}