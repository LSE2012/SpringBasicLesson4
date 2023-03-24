package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Entity
public class Users {
    public Users() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NonNull
    private String name;

    @Column
    private String email;

    @OneToMany
    @JoinColumn(name = "card_id")
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Cards> getCardsList() {
        return cardsList;
    }

}
