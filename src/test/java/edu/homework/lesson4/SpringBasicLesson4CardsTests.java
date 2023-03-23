package edu.homework.lesson4;

import edu.homework.lesson4.repository.CardsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringBasicLesson4CardsTests {
    @Autowired
    private CardsRepository cardsRepository;

    @Test
    public void testCardsRepoByName() {
        var  cardNumber = 1234567;
        var cards = cardsRepository.findAllByNumberIs(cardNumber);
        System.out.println("====== testCardsRepoByName() ========");
        cards.forEach(System.out::println);
    }


}
