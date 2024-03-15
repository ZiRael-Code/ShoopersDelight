package africa.semicolon.shoppersDelight.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static java.time.LocalDateTime.now;

@Entity
@Getter
@Setter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @ManyToOne(fetch =  FetchType.LAZY)
    @Cascade({CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REMOVE})
    private Store store;
    private Category productCategory;

    @PrePersist
    public void setCreatedAt() {
        this.createdAt = now();
    }

    @PreUpdate
    public void setUpdatedAt() {
        this.updatedAt = now();
    }
}
