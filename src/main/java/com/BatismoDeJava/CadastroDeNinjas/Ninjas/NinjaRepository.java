package com.BatismoDeJava.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

//ISSO DAQUI É PARA INICIAR O MEU BANCO DE DADOS
//Extends o JPA repository, coloca a classe e o tipo da chave da classe
//"ORM" SERVE PARA TRADUZIR O QUE ESCREVEMOS PARA O BANCO DE DADOS
public interface NinjaRepository extends JpaRepository<NinjaModel, Long>{

}
