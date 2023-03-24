package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersCrudRepository extends CrudRepository<Users,Integer> {
    @Override
    <S extends Users> Iterable<S> saveAll(Iterable<S> entities);
}
