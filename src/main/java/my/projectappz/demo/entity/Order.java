package my.projectappz.demo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
public class Order {
    @Id
    private Long id;

    @OneToMany(mappedBy = "order")
    private Set<Car> carMark;

    @OneToMany(mappedBy = "clientName")
    private Set<Client> clientSet;

    private String from;
    private String to;
    private BigDecimal price;
}
