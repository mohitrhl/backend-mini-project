package com.BMS.book_my_show.repository;

import com.BMS.book_my_show.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
}
