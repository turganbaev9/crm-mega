import dao.CourseFormatDao;
import static enums.Format.*;
import enums.Format;
import enums.FormatOldVersion;
import dao.ManagerDao;
import dao.MentorDao;
import dao.impl.*;
import enums.FormatOldVersion;
import model.CourseFormat;
import model.Group;
import model.Manager;
import model.Mentor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                //System.out.println("Hello world!");
                //Course course=new Course();
                //course.setId(1);
                //course.setName("Java");
                //course.setPrice(15000);

                //CourseFormat bootcamp=new CourseFormat();
                //bootcamp.setId(1);
                //bootcamp.setOnline(true);
                //bootcamp.setFormat("Bootcamp");
                //bootcamp.setLessonCountPerWeek(5);
                //bootcamp.setDurationInWeek(18);
                //bootcamp.setLessonDuration(3);
                //course.setCourseFormat(bootcamp);
                //System.out.println(course.toString());
               // MentorDao mentorDao=new MentorDaoImpl();
               // Scanner scanner=new Scanner(System.in);
               // Mentor mentor=new Mentor();
               // mentor.setId(scanner.nextLong());
               // mentor.setName(scanner.next());
               // mentor.setSurName(scanner.next());
               // mentor.setEmail(scanner.next());
               // mentor.setPhone(scanner.next());
               // mentor.setSalaryforlesson(scanner.nextDouble());
               // mentor.setExperience(scanner.nextDouble());
               //// mentor.setDateCreated();
               // mentorDao.save(mentor);
             //   GroupDao groupDao= new GroupDaoImpl();
             //   Scanner scanner1=new Scanner(System.in);
             //   Group group=new Group();
             //   group.setName(scanner1.next());
             //   group.setRoom(scanner1.next());
                //sgroup.setStartTime(LocalTime.parse(scanner1.nextLine().substring(1)));
                 // groupDao.save(group);
             //   ManagerDao managerDao = new ManagerDaoImpl();
             //  Scanner scanner = new Scanner(System.in);
             //  Manager manager = new Manager();
             //  manager.setId(scanner.nextLong());
             //  manager.setName(scanner.next());
             //  manager.setSurName(scanner.next());
             //  manager.setEmail(scanner.next());
             //  manager.setPhone(scanner.next());
             //  manager.setSalary(scanner.nextDouble());
             //  managerDao.save(manager);

                //    ManagerDao managerDao=new ManagerDaoImpl();
                //    Manager manager=new Manager();
                //    manager.setId(10);
                //    manager.setName("Aibek");
                //    manager.setSurName("Aybekov");
                //    manager.setEmail("bek@gmail.com");
                //    manager.setPhone("0555686874");
                //    manager.setSalary(45000);
                //    managerDao.save(manager);
                //    Manager[]managers= managerDao.findAll();
                //    System.out.println(Arrays.toString(managers));
            CourseFormat courseFormat=new CourseFormat();
            courseFormat.setFormat(BOOTCAMP);
            courseFormat.setLessonDuration(3);
            courseFormat.setOnline(true);
            courseFormat.setDurationInWeek(18);

        courseFormat.setLessonCountPerWeek(5);
        courseFormat.setId(4);
            CourseFormatDao courseFormatDao=new CourseFormatDaoImpl();
            //courseFormatDao.save(courseFormat);
            System.out.println(Arrays.toString(courseFormatDao.findAll()));
            System.out.println(BOOTCAMP.getA());
        }
}