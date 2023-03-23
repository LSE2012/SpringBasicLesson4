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
    @Column(name = "card_id")
    private Integer card_id;

    @Column
    @NonNull
    private Integer number;

    @Column
    @NonNull
    private Integer currency_code;

    @Column
    private Integer user_id;


    public Integer getCard_id() {
        return card_id;
    }

    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(Integer currency_code) {
        this.currency_code = currency_code;
    }


}
