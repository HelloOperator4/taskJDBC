
package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Peter", "Torsherchek", (byte) 25);
        userService.saveUser("Raul", "Prokaraul", (byte) 30);
        userService.saveUser("Stefan", "Jvachek", (byte) 35);
        userService.saveUser("Albert", "Linz", (byte) 40);

        System.out.println(userService.getAllUsers().toString());

        userService.removeUserById(1);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
