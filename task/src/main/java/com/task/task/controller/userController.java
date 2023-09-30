package main.java.com.task.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

import com.task.task.model.UserDetails;

@RestController
@RequestMapping("/submit-details")
public class userController {
    @Autowired
    private RestTemplate restTemplate;
    

    @PostMapping("/post")
    public ResponseEntity<String> submitDetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setName("Aayush");
        userDetails.setCollege("VIT Bhopal University");
        userDetails.setEmail("aayush.2442@gmail.com");
        userDetails.setDob("24-04-2002");
        userDetails.setRegNo(538);

        String apiUrl = "http://localhost:8080/ayush/submit-details/post";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<UserDetails> request = new HttpEntity<>(userDetails, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl, request,String.class);

        if(response.getStatusCode() == HttpStatus.OK){
            return ResponseEntity.ok("Data sent successfully to the api");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send data to the api.");

        }
    }
}
