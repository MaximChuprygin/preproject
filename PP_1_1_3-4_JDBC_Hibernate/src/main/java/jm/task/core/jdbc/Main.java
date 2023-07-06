package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        try {
            userService.createUsersTable();
            userService.saveUser("1","1", (byte) 1);
            userService.saveUser("2","2", (byte) 1);
            userService.saveUser("3","3", (byte) 1);
            userService.saveUser("4","4", (byte) 1);
            List <User> users = userService.getAllUsers();
            for (User a : users ) {
                System.out.println(a);
            }
            userService.cleanUsersTable();
            userService.dropUsersTable();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
