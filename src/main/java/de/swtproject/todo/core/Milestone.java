package de.swtproject.todo.core;

import java.util.LinkedList;
import java.util.List;

public class Milestone {
    private String titel;
    private String description;

    private List<ToDo> todos;

    public Milestone() {
        this.todos = new LinkedList<ToDo>();
    }

    public boolean addToDo(ToDo toDo) {
        return this.todos.add(toDo);
    }

    public boolean deleteToDo(ToDo toDo) {
        return this.todos.remove(toDo);
    }

    public List<ToDo> getToDos() {
        return this.todos;
    }
}
