package my.projectappz.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Class {
    @Id
    private Long id;
    private String name;
    private String discription;
    @OneToMany(mappedBy = "aclass")
    private Set<Car> carSet;
}
