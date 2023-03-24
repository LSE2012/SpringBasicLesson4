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
    private Integer cardid;

    @Column
    @NonNull
    private Integer number;

    @Column
    @NonNull
    private Integer currencyCode;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne
    @JoinColumn(name = "currencyCode")
    private List<Currency> currencyList;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToOne
    @JoinColumn(name = "cardid")
    private List<Users> usersList;


    public Integer getCardId() {
        return cardid;
    }

    public void setCardId(Integer cardId) {
        this.cardid = cardId;
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

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }
}
