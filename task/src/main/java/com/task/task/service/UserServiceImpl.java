package main.java.com.task.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.task.Repository.taskrepo;
import com.task.task.model.UserDetails;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private taskrepo userrepo;

    // @Override
    // public UserDetails savesUserDetails(UserDetails user){
    //     return userrepo.save(user);
    // }

    @Override
    public List<UserDetails> getAllDetails() {
        return userrepo.findAll();
    }
}
