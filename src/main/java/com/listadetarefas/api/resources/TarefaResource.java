package com.listadetarefas.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listadetarefas.api.models.Tarefa;
import com.listadetarefas.api.repository.TarefaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/tarefasApi")
@Api(value="API Tarefas")
@CrossOrigin(origins="*")
public class TarefaResource {

	@Autowired
	TarefaRepository tarefaRepository;
	
	//LISTA TODOS
	@GetMapping("/tarefas")
	@ApiOperation(value="Retorna Lista de tarefas")
	public List<Tarefa> listaTarefas(){
		return tarefaRepository.findAll();
	}
	
	//LISTA POR ID
	@GetMapping("/tarefa/{id}")
	@ApiOperation(value="Retorna Tarefa pelo ID")
	public Tarefa listaTarefa(@PathVariable(value="id") long id){
		return tarefaRepository.findById(id);
		//foi criado um metodo personalizado pra poder pegar 1 id so la no TarefaRepository
	}
	
	@PostMapping("/addTarefa")
	@ApiOperation(value="Adiciona um produto")
	public Tarefa addTarefa(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	@DeleteMapping("/tarefas")
	@ApiOperation(value="Deleta um produto")
	public void deletaTarefa(@RequestBody Tarefa tarefa) {
		tarefaRepository.delete(tarefa);
	}
}
