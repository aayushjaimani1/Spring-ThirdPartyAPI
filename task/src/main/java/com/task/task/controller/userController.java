
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    }
}
