package main.java.com.task.task.service;

import java.util.List;

import com.task.task.model.UserDetails;

public interface UserService {
    public UserDetails savesUserDetails(UserDetails user);

    public List<UserDetails> getAllDetails();
}
