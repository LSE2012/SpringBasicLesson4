package edu.homework.lesson4.services;

import edu.homework.lesson4.entity.Cards;
import edu.homework.lesson4.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CardService {
    private final CardsRepository cardsRepository;

    @Autowired
    public CardService(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    public List<Cards> findAllCards() {
        return cardsRepository.findAll();
    }

    public Cards findOneById(int id) {
        Optional<Cards> foundCard =  cardsRepository.findById(id) ;
        return foundCard.orElse(null);
    }

    @Transactional
    public void save(Cards cards) {
        cardsRepository.save(cards);
    }

    @Transactional
    public void update(int id, Cards updateCards) {
        updateCards.setCard_id(id);
        cardsRepository.save(updateCards);
    }

    @Transactional
    public void delete(int id ) {
        cardsRepository.deleteById(id);
    }



}
