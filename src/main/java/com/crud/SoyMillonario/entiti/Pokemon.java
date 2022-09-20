package com.crud.SoyMillonario.entiti;


import com.crud.SoyMillonario.enums.Enum_Tipo;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pokemon {


  //----------------atributos------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    private int vida;

    private int ataque;

    private int edad;


    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Enum_Tipo tipo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;



}
