package com.jorder.mana.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_proteins")
@Data
public class Protein {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String desc;
    private String name;
    private Float price;

}
