package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findUsersById(Integer id);

    List<Users> findUsersByNameIs(String name);

    List<Users> findUsersByEmailIs(String email);

    List<Users> getByEmailContains(String email);

    List<Users> searchByNameContains(String name);

}
