package com.tg.online.tutor.entity;

import javax.persistence.*;

@Entity
@Table(name = "TG_ENTITY_TYPE")
public class EntityType {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

}
