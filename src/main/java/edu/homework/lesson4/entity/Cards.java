package edu.homework.lesson4.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Cards {
    public Cards() {
    }
    @Id
    @Column(name = "cardId")
    private Integer cardId;

    @Column
    @NonNull
    private Integer number;

    @Column
    @NonNull
    private Integer currencyCode;

    @Column
    private Integer userId;


    public Integer getCardId() {
        return cardId;
    }

    public void setCard_id(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Integer currencyCode) {
        this.currencyCode = currencyCode;
    }


}
