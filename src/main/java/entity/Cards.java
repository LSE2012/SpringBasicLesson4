package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

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


}
