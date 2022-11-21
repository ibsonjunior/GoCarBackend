package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Booking;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BookingDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private LocalDateTime initialTime;
    private LocalDateTime initalDay;
    private LocalDateTime finalDay;
    private ProductForImageDto product;
//    private UserForBookingDto user;

    public BookingDto() {
    }

    public BookingDto(Integer id, LocalDateTime initialTime, LocalDateTime initalDay, LocalDateTime finalDay) {
        this.id = id;
        this.initialTime = initialTime;
        this.initalDay = initalDay;
        this.finalDay = finalDay;
    }

    public BookingDto(Booking booking) {
        this.id = booking.getId(); ;
        this.initialTime = booking.getInitialTime();
        this.initalDay = booking.getInitalDay() ;
        this.finalDay = booking.getFinalDay() ;
        this.product = new ProductForImageDto(booking.getProduct());
//        this.user = new UserForBookingDto(booking.)
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

    public ProductForImageDto getProduct() {
        return product;
    }

    public void setProduct(ProductForImageDto product) {
        this.product = product;
    }
}
