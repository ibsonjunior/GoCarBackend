package br.com.digitalhouse.dtos;

import br.com.digitalhouse.entities.User;

import java.io.Serializable;

public class UserForBookingDto implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public UserForBookingDto() {
    }

    public UserForBookingDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserForBookingDto(User user) {
        this.id = user.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
