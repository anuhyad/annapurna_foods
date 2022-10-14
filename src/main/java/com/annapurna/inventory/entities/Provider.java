package com.annapurna.inventory.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="provider")
public class Provider {

    @Id
    @Column(name="provider_id")
    private Long provider_id;

    @Column (name="phone")
    private Long phoneNo;

    @Column (name="provider_name")
    private String providerName;

}
