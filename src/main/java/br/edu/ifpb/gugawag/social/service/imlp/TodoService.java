package br.edu.ifpb.gugawag.social.service.imlp;

import br.edu.ifpb.gugawag.social.model.Todo;
import br.edu.ifpb.gugawag.social.repository.TodoRepository;
import br.edu.ifpb.gugawag.social.service.ITodoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepositorio;

    @Override
    public List<Todo> getTodos() {

        return todoRepositorio.findAll();
    }

    @Override
    public Todo addTodos(Todo todo)
    {
        return todoRepositorio.save(todo);
    }

    @Override
    public Todo getTodo(Integer id) {
        return todoRepositorio.findById(id).orElse(new Todo());
    }

    @Override
    public Boolean removerTodo(Integer id) {
        Todo todo = this.getTodo(id);
        try{
            todoRepositorio.delete(todo);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Transactional
    @Override
    public Todo atualizarTodo(Todo todo) {
        Todo todoInserido = this.todoRepositorio.save(todo);
        return todoInserido;
    }
}

