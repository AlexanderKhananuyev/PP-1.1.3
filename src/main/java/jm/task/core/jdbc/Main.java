package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Иван", "Иванов", (byte) 40);
        service.saveUser("Дмитрий", "Петров", (byte) 41);
        service.saveUser("Алексей", "Морозов", (byte) 42);
        service.saveUser("Сергей", "Владимиров", (byte) 43);

        service.removeUserById(1);

        System.out.println(service.getAllUsers());

        service.cleanUsersTable();

        service.dropUsersTable();
    }
}