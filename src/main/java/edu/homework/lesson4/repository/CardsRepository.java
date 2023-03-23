package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsRepository extends JpaRepository<Cards,Integer> {
}
