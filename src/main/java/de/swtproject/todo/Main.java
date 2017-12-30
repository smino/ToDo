package de.swtproject.todo;

import de.swtproject.todo.core.ToDo;
import de.swtproject.todo.core.database.DatabaseManager;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        DatabaseManager.getManager().saveToDo(new ToDo("Title", "Description"));
        System.out.println(DatabaseManager.getManager().loadToDo("Title").getTitel());
    }
}
