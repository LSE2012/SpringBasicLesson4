package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards,Integer> {
}
