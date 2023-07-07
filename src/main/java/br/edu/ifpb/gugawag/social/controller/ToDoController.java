package br.edu.ifpb.gugawag.social.controller;

import br.edu.ifpb.gugawag.social.model.Todo;
import br.edu.ifpb.gugawag.social.service.imlp.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ToDoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/tasks")
    public List<Todo> getTodos(){
        return this.todoService.getTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoPorId(@PathVariable("id") Integer idTodo) {
        return this.todoService.getTodo(idTodo);
    }

    @PostMapping("/tasks")
    public Todo inserirTodo(@RequestBody Todo todoAInserir) {
        return this.todoService.addTodos(todoAInserir);
    }

    @PutMapping("/tasks/{id}")
    public Todo atualizarTodo(@RequestBody Todo todoAtualizar) {
        return this.todoService.atualizarTodo(todoAtualizar);
    }

    @DeleteMapping("tasks/{id}")
    public void apagarTodo(@PathVariable("id") Integer id) {
        this.todoService.removerTodo(id);
    }

}
