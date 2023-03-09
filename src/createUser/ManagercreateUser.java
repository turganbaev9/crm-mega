package createUser;

import dao.impl.ManagerDao;
import dao.impl.ManagerDaoImpl;
import model.Manager;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ManagercreateUser {
    Manager manager=new Manager();
    Scanner sc=new Scanner(System.in);

    public void createManager() throws IOException {

        System.out.println("Ваше имя");
        manager.setName(sc.next());
        System.out.println("Ваше фамилия");
        manager.setSurName(sc.next());
        System.out.println("Ваш номер телефона");
        manager.setPhone(sc.next());
        System.out.println("Ваш электронный адрес");
        manager.setEmail(sc.next());
        System.out.println("Ваша зарплата");
        manager.setSalary(sc.nextDouble());

        manager.setDateCreated(LocalDateTime.now());
        ManagerDao managerDao = new ManagerDaoImpl();
        managerDao.save(manager);
        managerDao.findAll();
        System.out.println("Рахмат вы сохранены");
    }
}
