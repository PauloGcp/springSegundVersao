package br.edu.ifpb.gugawag.social.repository;

import br.edu.ifpb.gugawag.social.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {

}
