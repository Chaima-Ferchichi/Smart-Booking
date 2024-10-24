package com.example.hebergement.Data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "hebergement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hebergement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column
    private String localisation;

    @Column
    private String telephone;

    @Column
    private String fax;

    @Column
    private String etoile;

    @Column
    private String description;

    @Column
    private boolean entertaiment;

    @Column
    private boolean pescine;

    @Column
    private boolean parking;

    @Column
    private boolean restauration;

    @Column
    private String etat;
}
