package main.java.com.task.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.task.model.UserDetails;

@Repository
public interface taskrepo extends JpaRepository<UserDetails,Integer> {
    
}
