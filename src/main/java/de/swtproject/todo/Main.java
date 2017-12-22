package de.swtproject.todo;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import de.swtproject.todo.core.ToDo;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        //this uses h2 but you can change it to match your database
        String databaseUrl = "jdbc:sqlite:src/main/resources/database.db";

        //create a connection source to our database

        // instantiate the DAO to handle Account with String id
        Dao<ToDo,String> accountDao = DaoManager.createDao(connectionSource, ToDo.class);
        // if you need to create the 'accounts' table make this call

        TableUtils.createTable(connectionSource, ToDo.class);
        // create an instance of Account
        String name = "Jim Smith";
        ToDo account = new ToDo(name, "Ich bin eine Beschreibung");

        // persist the account object to the database
        accountDao.create(account);

        // retrieve the account
        ToDo account2 = accountDao.queryForId(name);

        // show its password
        System.out.println("Account: " + account2.getTitel());

        // close the connection source
        connectionSource.close();
    }
}
