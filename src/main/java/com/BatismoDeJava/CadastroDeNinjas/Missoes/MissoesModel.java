package com.BatismoDeJava.CadastroDeNinjas.Missoes;

import com.BatismoDeJava.CadastroDeNinjas.Ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nome;
    private String tipo;

    //Uma missao para muitos ninjas
    @OneToMany (mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;


}
