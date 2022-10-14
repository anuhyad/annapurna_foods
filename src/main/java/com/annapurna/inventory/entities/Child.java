package com.annapurna.inventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHILD")
public class Child {

    @Id
    private long child_id;

    @Column (name="provider_id")
    private long providerId;

    @Column (name="child_name")
    private String child_name;

}
