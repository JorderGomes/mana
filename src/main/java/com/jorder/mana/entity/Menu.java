package com.jorder.mana.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_menus")
@Data
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private LocalDate initialDate;
    private LocalDate finalDate;

    @ManyToMany
    @JoinTable(
            name = "tb_menu_proteins",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "protein_id")
    )
    private List<Protein> proteins;

    @ManyToMany
    @JoinTable(
            name = "tb_menu_side_dishes",
            joinColumns = @JoinColumn(name = "side_dish_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private List<SideDish> sideDishes;

}
