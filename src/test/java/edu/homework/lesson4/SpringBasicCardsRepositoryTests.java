package edu.homework.lesson4;

import edu.homework.lesson4.repository.CardsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBasicCardsRepositoryTests {
    @Autowired
    private CardsRepository cardsRepository;

    @Test
    public void testCardsRepositoryGetCardId() {
        var card = cardsRepository.findAll();
        card.forEach(System.out::println);
    }
}
