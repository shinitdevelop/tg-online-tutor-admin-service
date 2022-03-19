package com.tg.online.tutor.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TG_INSTITUTION_TEACHER")
public class InstitutionTeacher {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PIC")
    private String pic;

    @Column(name = "DOB")
    private LocalDate dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TG_ADDRESS_ID")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TG_INSTITUTION_ID")
    private Institution institution;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;
}
