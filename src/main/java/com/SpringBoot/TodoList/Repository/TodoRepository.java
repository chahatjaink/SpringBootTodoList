package com.SpringBoot.TodoList.Repository;

import com.SpringBoot.TodoList.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TodoRepository extends JpaRepository<Todo,Integer>
{
}
