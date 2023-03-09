package createUser;


import dao.impl.StudentDao;
import dao.impl.StudentDaoImpl;
import enums.Command;
import model.BaseEntity;
import model.Student;
import model.User;


import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StudentcreateUser {
    Student student = new Student();
    Scanner sc = new Scanner(System.in);

    public void setUser() throws IOException {
        System.out.println("Ваше имя");
        student.setName(sc.next());
        System.out.println("Ваше фамилия");
        student.setSurName(sc.next());
        System.out.println("Ваш номер телефона");
        student.setPhone(sc.next());
        System.out.println("Ваш электронный адресс");
        student.setEmail(sc.next());
        System.out.println("СПАСИБО");
student.setDob(LocalDate.parse(sc.next()));
        student.setDateCreated(LocalDateTime.now());
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.save(student);
    }
}