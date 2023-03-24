package edu.homework.lesson4;

import edu.homework.lesson4.entity.Cards;
import edu.homework.lesson4.repository.CardsCrudRepository;
import edu.homework.lesson4.repository.CardsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringBasicCardsRepositoryTests {
    @Autowired
    private CardsRepository cardsRepository;

    @Autowired
    private CardsCrudRepository cardsCrudRepository;

    @Test
    public void testCardsRepositoryGetCardId() {
        var card = cardsRepository.findAll();
        card.forEach(System.out::println);
    }


    @Test
    public void testCardsFindAll() {
        var cardID = 1;
        List<Cards> cardsList =  cardsRepository.findAllByCardId(cardID);
        cardsList.forEach(System.out::println);
    }

    @Test
    public void testCardSaveRepository() {
        Cards card = new Cards();
        card.setNumber(123654);
        card.setCurrencycode(980);
        card.setUserid(2);
        cardsRepository.save(card);
    }

    @Test
    public void testCardsUpdateRepository() {
        var count = cardsRepository.count();
        cardsRepository.deleteById(Math.toIntExact(count));
    }


    @Test
    public void testCardsCrudRepository() {
        var cardID = 2;
        var card = cardsCrudRepository.findById(cardID).orElse(null);
        System.out.println(card.toString());

    }

}
