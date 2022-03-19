package com.tg.online.tutor.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name = "TG_SHORTHAND_WORD")
public class ShorthandWord {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "ENGLISH_WORD")
    private String englishWord;

    @Column(name = "SHORT_HAND_WORD")
    private Blob shortHandWord;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_ID")
    private ShorthandCategory categoryId;

    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

   }
