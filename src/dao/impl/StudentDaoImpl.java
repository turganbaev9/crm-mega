package dao.impl;

import model.Student;

import java.io.*;

public class StudentDaoImpl implements StudentDao {
    private final String PATH_FILE = "C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\Student.txt";
    private final File Student_File = new File(PATH_FILE);

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
    public void save(Student student) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(student.getId());
            out.print(student.getName());
            out.print(student.getSurName());
            out.print(student.getDob());
            out.print(student.getDateCreated());
            out.print(student.getEmail());
            out.print(student.getPhone());
            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }

    @Override
    public Student[] findAll() {
        return new Student[0];
    }


}


