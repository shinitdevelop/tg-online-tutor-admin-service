package com.tg.online.tutor.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TG_INSTITUTION_ADMIN")
public class InstitutionAdmin {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PIC")
    private String pic;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TG_INSTITUTION_ID")
    private Institution tgInstitutionId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TG_ADDRESS_ID")
    private Address address;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;


}
