package edu.homework.lesson4.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Currency {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer code;

    @OneToMany
    @JoinColumn(name = "currency_code")
    private List<Cards> cardsList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Cards> getCardsList() {
        return cardsList;
    }
}
