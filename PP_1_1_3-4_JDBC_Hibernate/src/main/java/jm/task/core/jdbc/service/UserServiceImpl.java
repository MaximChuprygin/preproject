package jm.task.core.jdbc.service;

import jm.task.core.jdbc.Main;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl  implements UserService {
    UserDaoJDBCImpl userDaoJDBSImpl = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {
        userDaoJDBSImpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoJDBSImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoJDBSImpl.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) throws SQLException {
        userDaoJDBSImpl.removeUserById(id);

    }

    public List<User> getAllUsers() throws SQLException {
        return userDaoJDBSImpl.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDaoJDBSImpl.cleanUsersTable();

    }
}
