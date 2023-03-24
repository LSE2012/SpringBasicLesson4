package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Cards;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CardsCrudRepository extends CrudRepository<Cards, Integer> {
    @Override
    Optional<Cards> findById(Integer integer);
}
