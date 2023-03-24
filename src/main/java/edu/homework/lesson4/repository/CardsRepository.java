package edu.homework.lesson4.repository;

import edu.homework.lesson4.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards,Integer> {
    List<Cards> findAllByCardId(int cardId);
    List<Cards> findAllByNumberIs(int number);
    Cards deleteCardsByNumberIs(int number);

}
