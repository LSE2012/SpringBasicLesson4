package edu.homework.lesson4;

import edu.homework.lesson4.entity.Cards;
import edu.homework.lesson4.repository.CardsRepository;
import edu.homework.lesson4.services.CardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    public void testCardsServiceFindOneById() {
        var cardId = 2;
        List<Cards> cards = new CardService(cardsRepository).findAllCards();
        System.out.println("====== testCardsServiceFindOneById() ========");
        cards.forEach(System.out::println);
    }
}
