package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import com.BatismoDeJava.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity trasforma uma classe em uma classe uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_ninja")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "rank")
    private String rank;

    //Muitos ninjas podem ter a mesma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira
    private MissoesModel missoes;




}
