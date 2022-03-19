package com.tg.online.tutor.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@Entity
@Table(name = "TG_ADDRESS")
public class Address {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "pin_code")
    private Long pinCode;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;


}
