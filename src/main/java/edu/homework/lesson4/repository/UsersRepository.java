package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> getUsersById(Integer id);

    List<Users> getUsersByNameIs(String name);

}
