package Courses;

import dao.impl.CourseFormatDao;
import dao.impl.CourseFormatDaoImpl;
import enums.Courses;
import enums.Format;
import model.BaseEntity;
import model.Course;
import model.CourseFormat;

import java.util.Scanner;

public class CoursesForStudents {
    Scanner scanner=new Scanner(System.in);
    Courses courses=null;
    Format format=null;
    CourseFormatDaoImpl courseFormatDao=new CourseFormatDaoImpl();


    public void infoCourses(){
        System.out.println("Выберите одно из этих курсов в которые вы хотите попасть");
        courses=Courses.valueOf(scanner.next());
        switch (courses){
            case JAVA ->{
                Course course=new Course();
                CourseFormat courseFormat=new CourseFormat();
           break; }
        }
        System.out.println("На какой формат обучения вы хотите выбрать");
        format=Format.valueOf(scanner.next());
        switch (format){
            case BOOTCAMP -> {
                CourseFormat courseFormat=new CourseFormat();
            }
        }
    }


}
