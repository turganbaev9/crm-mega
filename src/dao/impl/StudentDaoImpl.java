package dao.impl;

import model.Course;
import model.Student;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
    private final String PATH_FILE = "C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\Student.txt";
    private final File Student_File = new File(PATH_FILE);
    private int count ;
    public StudentDaoImpl() {
        boolean isCreated = false;

        if (!Student_File.exists()) {
            try {
                isCreated = Student_File.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("новый документ создан");
        }

    }

    @Override
    public void save(Student student) throws IOException {
        count=getCount();
PrintWriter out=null;
        try {
            out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(++count + " " );
            out.print(student.getName() + "  ");
            out.print(student.getSurName()+ "  ");
            out.print(student.getDob()+ "  ");
            out.print(student.getDateCreated()+ "  ");
            out.print(student.getEmail()+ "  ");
            out.print(student.getPhone()+ "  ");
            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }finally {
            close(out);
        }
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[100];
        try {
            Scanner scanner = new Scanner(Student_File);
            for (int i = 0; scanner.hasNextLine(); i++) {
                Student student = new Student();
                student.setName(scanner.next());
                student.setSurName(scanner.next());
                student.setEmail(scanner.next());
                student.setPhone(scanner.next());
                //group.setStartTime(LocalTime.parse(scanner.nextLine().substring(1)));
                students[i]=student;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return students;
    }
    private int getCount() {
        int count=0;
        try {
            Scanner scanner = new Scanner(Student_File);
            while (scanner.hasNextLine()){
                count++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

}





