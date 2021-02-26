package my.projectappz.demo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Driver {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "driver")
    private Set<Car> carSet;

}
