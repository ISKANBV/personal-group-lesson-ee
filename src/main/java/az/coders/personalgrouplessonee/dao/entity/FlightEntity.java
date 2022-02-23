package az.coders.personalgrouplessonee.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flights")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ticket_no")
    private int ticketNo;

    @Column(name = "ticket_price")
    private BigDecimal ticketPrice;

    @Column(name = "ticket_destination")
    private String ticketDestination;

    @OneToMany(mappedBy = "",targetEntity = PersonEntity.class)
    private List<PersonEntity> persons;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
