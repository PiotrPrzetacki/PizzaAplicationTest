package pl.przetacki.pizzaaplicationtest.data.entity.size;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "pizza_id")
    private Integer pizzaId;
}
