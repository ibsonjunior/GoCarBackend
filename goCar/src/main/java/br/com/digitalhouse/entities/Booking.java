package br.com.digitalhouse.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table
public class Booking implements Serializable {
    public static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime initialTime;
    private LocalDateTime initalDay;
    private LocalDateTime finalDay;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_product", nullable = true)
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_user", nullable = true)
    private User user;

    public Booking() {
    }

    public Booking(LocalDateTime initialTime, LocalDateTime initalDay, LocalDateTime finalDay) {
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public Booking(Integer id, LocalDateTime initialTime, LocalDateTime initalDay, LocalDateTime finalDay) {
        this.id = id;
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(LocalDateTime initialTime) {
        this.initialTime = initialTime;
    }

    public LocalDateTime getInitalDay() {
        return initalDay;
    }

    public void setInitalDay(LocalDateTime initalDay) {
        this.initalDay = initalDay;
    }

    public LocalDateTime getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(LocalDateTime finalDay) {
        this.finalDay = finalDay;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
