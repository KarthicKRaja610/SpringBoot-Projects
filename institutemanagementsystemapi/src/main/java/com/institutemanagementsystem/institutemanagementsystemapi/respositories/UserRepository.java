package com.institutemanagementsystem.institutemanagementsystemapi.respositories;

import com.institutemanagementsystem.institutemanagementsystemapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
