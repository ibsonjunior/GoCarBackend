package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.Booking;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BookingDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
    private  String initialTime;
    private  String initalDay;
    private  String finalDay;
    private ProductForImageDto product;

    private UserForBookingDto user;

    public BookingDto() {
    }

    public BookingDto(Integer id,  String initialTime,  String initalDay,  String finalDay) {
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
        this.user = new UserForBookingDto(booking.getUser());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public String getInitalDay() {
        return initalDay;
    }

    public void setInitalDay(String initalDay) {
        this.initalDay = initalDay;
    }

    public String getFinalDay() {
        return finalDay;
    }

    public void setFinalDay(String finalDay) {
        this.finalDay = finalDay;
    }

    public ProductForImageDto getProduct() {
        return product;
    }

    public void setProduct(ProductForImageDto product) {
        this.product = product;
    }

    public UserForBookingDto getUser() {
        return user;
    }

    public void setUser(UserForBookingDto user) {
        this.user = user;
    }
}
