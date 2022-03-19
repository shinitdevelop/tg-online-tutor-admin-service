package com.tg.online.tutor.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TG_SHORTHAND_CATEGORY")
public class ShorthandCategory {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @ManyToOne
    @JoinColumn(name = "TG_INSTITUTION_ID")
    private Institution institution;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

   }
