package dao.impl;

import model.Course;
import model.CourseFormat;
import model.Group;

import java.io.*;
import java.util.Scanner;

public class CoursesDaoImp implements CoursesDao{

    private final String PATH_FILE = "C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\Courses.txt";
    private final File COURSES_FILE = new File(PATH_FILE);

public CoursesDaoImp(){
    boolean isCreated=false;
    if (!COURSES_FILE.exists()){
        try {
            isCreated =COURSES_FILE.createNewFile();
        if (isCreated){
            System.out.println("Создан документ");
        }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    @Override
    public Course[] findAll() {
        Course[] courses = new Course[100];
        try {
            Scanner scanner = new Scanner(COURSES_FILE);
            for (int i = 0; scanner.hasNextLine(); i++) {
                Course course = new Course();
                course.setName(scanner.next());
                course.setPrice(scanner.nextDouble());
                //group.setStartTime(LocalTime.parse(scanner.nextLine().substring(1)));
                courses[i]=course;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return courses;
    }






    @Override
    public void save (Course course) throws IOException {
    PrintWriter out=null;
    try {
        out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
        out.print(course.getName() + " " );
        out.print(course.getId()+ " " );
        //out.print(course.getCourseFormat() + "  " );
out.print(course.getPrice());
        out.println();
        out.close();
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    }finally {
        close(out);
    }

}

    }

