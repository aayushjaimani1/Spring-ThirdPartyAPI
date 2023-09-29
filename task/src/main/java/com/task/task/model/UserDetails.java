package main.java.com.task.task.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class UserDetails {
    
    private String name;
    private String college;
    private String email;
    private int regNo;
    private String dob;

}