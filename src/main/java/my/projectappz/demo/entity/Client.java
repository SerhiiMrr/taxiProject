package my.projectappz.demo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity

public class Client {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "clientName_id")
    private Order clientName;

    private String name;
}
