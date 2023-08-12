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
}