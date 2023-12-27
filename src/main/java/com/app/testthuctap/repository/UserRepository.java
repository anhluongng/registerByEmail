package com.app.testthuctap.repository;


import com.app.testthuctap.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailIgnoreCase(String emailId);

    Boolean existsByEmail(String email);
}
