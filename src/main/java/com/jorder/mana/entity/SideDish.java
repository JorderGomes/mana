package com.jorder.mana.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_side_dishes")
@Data
public class SideDish {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String desc;
}
