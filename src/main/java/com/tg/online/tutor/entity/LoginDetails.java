package com.tg.online.tutor.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tg_login_details")
public class LoginDetails {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CONTACT")
    private Long contact;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "OTP")
    private Long otp;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TG_ENTITY_TYPE_ID")
    private EntityType entityType;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;
}
