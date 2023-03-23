package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NonNull
    private String name;

    @Column
    private String email;

    public Users() {

    }
}
