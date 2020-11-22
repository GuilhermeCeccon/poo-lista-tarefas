package com.listadetarefas.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // PRA PODER SER MAPEADO COM UMA TBL NO BANCO DE DADOS
@Table(name="TAREFAS") //NOME DA TABELA NO BANCO DE DADOS
public class Tarefa implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome_tarefa;
	
	private String data_tarefa;
	
	private String data_criacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_tarefa() {
		return nome_tarefa;
	}

	public void setNome_tarefa(String nome_tarefa) {
		this.nome_tarefa = nome_tarefa;
	}

	public String getData_tarefa() {
		return data_tarefa;
	}

	public void setData_tarefa(String data_tarefa) {
		this.data_tarefa = data_tarefa;
	}

	public String getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}
	
	
}
