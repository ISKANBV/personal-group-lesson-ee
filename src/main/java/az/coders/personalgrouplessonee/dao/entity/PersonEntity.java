package az.coders.personalgrouplessonee.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String surname;

    private byte age;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinTable(name = "person_products",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductEntity> products;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updateAt;

}
