package com.SpringBoot.TodoList.model;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;

    String title;
    String descr;
    boolean taskCompleted;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isTaskCompleted() {
        return taskCompleted;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }
}
