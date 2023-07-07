package br.edu.ifpb.gugawag.social.service;

import br.edu.ifpb.gugawag.social.model.Todo;

import java.util.List;

public interface ITodoService {

    List<Todo> getTodos();

    Todo addTodos(Todo todo);

    Todo getTodo(Integer id);

    Boolean removerTodo(Integer id);

    Todo atualizarTodo(Todo todo);
}
