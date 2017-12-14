public class Milestone {
    private String titel;
    private String description;

    private List<ToDo> todos;

    public Milestone() {
        this.todos = new LinkedList<>();
    }

    public boolean addToDo(ToDo toDo) {
        returen this.todos.add(toDo);
    }

    public boolean deleteToDo(ToDo toDo) {
        return this.todos.remove(toDo);
    }

    public List<ToDo> getToDos() {
        return this.todos;
    }
}
