package de.swtproject.todo.core.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import de.swtproject.todo.core.ToDo;
import de.swtproject.todo.util.Settings;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Manager controller for accessing the database.
 * Used to store and receive objects from the databasse.
 *
 * @author Ruben Maurer
 * @version 1.0
 * @since 0.1
 */
public class DatabaseManager {

    /**
     * The connection source used by the manager.
     */
    private ConnectionSource connectionSource;

    /**
     * The database access object used by the manager.
     */
    private Dao<ToDo,String> databaseAccess;

    /**
     * DatabaseManager singleton.
     */
    private static DatabaseManager databaseManager = new DatabaseManager();

    /**
     * Get the database manager.
     *
     * @return the database manager
     */
    public static DatabaseManager getManager() {
        return databaseManager;
    }

    /**
     * Constructor for a new DatabaseManager
     */
    private DatabaseManager() {
        try {
            String conString = Settings.getConnectionString().intern();

            connectionSource = new JdbcConnectionSource(conString);
            databaseAccess = DaoManager.createDao(connectionSource, ToDo.class);

            TableUtils.createTableIfNotExists(connectionSource, ToDo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close the used connection source.
     *
     * @throws IOException on I/O exception
     */
    public void destroy() throws IOException {
        connectionSource.close();
    }

    /**
     * Save a single object.
     *
     * @param todo the object to save
     * @throws SQLException on SQL exception
     */
    public void saveToDo(ToDo todo) throws SQLException {
        databaseAccess.createIfNotExists(todo);
    }

    /**
     * Saves a collection of objects
     *
     * @param collection the collections to save
     * @return the status
     * @throws SQLException on SQL exception
     */
    public int saveToDos(Collection<ToDo> collection) throws SQLException {
        return databaseAccess.create(collection);
    }

    /**
     * Load a single object from the database.
     *
     * @param id the string to query with
     * @return the loaded object
     * @throws SQLException on SQL exception
     */
    public ToDo loadToDo(String id) throws SQLException {
        return databaseAccess.queryForId(id);
    }

    /**
     * Load all object from database.
     *
     * @return the loaded objects
     * @throws SQLException on SQL exceptions
     */
    public Collection<ToDo> loadAllToDo() throws SQLException {
        return databaseAccess.queryForAll();
    }
}