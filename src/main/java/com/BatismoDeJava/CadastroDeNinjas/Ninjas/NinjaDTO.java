package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import com.BatismoDeJava.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String imgUrl;
    private String email;
    private int idade;
    private String rank;
    private MissoesModel missoes;


}
