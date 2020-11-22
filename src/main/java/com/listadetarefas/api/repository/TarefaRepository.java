package com.listadetarefas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listadetarefas.api.models.Tarefa;

//NOME DA CLASSE QUE "GERA A TABELA" E O TIPO DO ID
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

	Tarefa findById(long id);//aki so cria assim é q o spring meio que ja entende esse padrao findbyid
}
