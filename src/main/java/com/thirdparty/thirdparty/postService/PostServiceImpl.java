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
    private HttpHeaders gethttpHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}