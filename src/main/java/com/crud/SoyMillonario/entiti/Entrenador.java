package com.crud.SoyMillonario.entiti;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;


    @OneToOne(mappedBy = "entrenador")
    private Pokemon pokemon;
}
