package de.swtproject.todo.core.database;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import de.swtproject.todo.core.ToDo;

import java.sql.SQLException;
import java.util.List;

public class DatabaseManager {

    private ConnectionSource connectionSource;

    private static DatabaseManager databaseManager = new DatabaseManager();

    public static DatabaseManager getManager() {
        return databaseManager;
    }

    private DatabaseManager() {
        try {
            connectionSource = new JdbcConnectionSource("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ToDo loadToDo() {
        return null;
    }

    public List<ToDo> loadToDos() {
        return null;
    }
}
