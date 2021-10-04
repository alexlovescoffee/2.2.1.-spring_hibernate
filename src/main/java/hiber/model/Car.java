package hiber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter @Setter @ToString
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;

    private int series;

    @OneToOne(mappedBy = "car")
    @ToString.Exclude
    private User owner;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}
