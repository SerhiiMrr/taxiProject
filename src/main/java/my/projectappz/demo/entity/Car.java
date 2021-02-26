package my.projectappz.demo.entity;



import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name = "taxidb")
public class Car {
    @Id
    private Long id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "aclass_id")
    private Class aclass;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
