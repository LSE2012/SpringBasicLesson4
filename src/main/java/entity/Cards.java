package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Entity
public class Cards {
    public Cards() {
    }
    @Id
    private Integer card_id;

    @Column
    @NonNull
    private Integer number;

    @Column
    @NonNull
    private Integer currency_code;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne
    @JoinColumn(name = "currency_code")
    private List<Currency> currencyList;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne
    @JoinColumn(name = "card_id")
    private List<Users> usersList;


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

    public List<Currency> getCurrencyList() {
        return currencyList;
    }
}
