package restfulapi.task.vetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "customer_ID_key", nullable = false, unique = true)
    private short customerID;

    @Column(name = "customer_PIN", nullable = false, unique = true)
    private short customerPIN;

    @OneToMany(fetch = FetchType.EAGER,  cascade = CascadeType.MERGE, mappedBy = "customer")
    private Set<Appointment> appointments;
}
