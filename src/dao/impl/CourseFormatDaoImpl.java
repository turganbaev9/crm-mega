package dao.impl;

import enums.Format;
import model.CourseFormat;

import java.io.*;
import java.util.Scanner;

public class CourseFormatDaoImpl implements CourseFormatDao {
    private final String PATH_FILE = "C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\CourseFormat.txt";

    private final File COURSE_FORMAT_FILE = new File(PATH_FILE);
    private int count;

    public CourseFormatDaoImpl() {
        boolean isCreated = false;
        if (!COURSE_FORMAT_FILE.exists()) {
            try {
                isCreated = COURSE_FORMAT_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
        count = getCount();
    }

    @Override
    public void save(CourseFormat courseFormat) throws IOException {
        count = getCount();
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(++count + " ");
            out.print(courseFormat.getFormat() + " ");
            out.print(courseFormat.getDurationInWeek() + " ");
            out.print(courseFormat.isOnline() + " ");
            out.print(courseFormat.getLessonDuration() + " ");
            out.print(courseFormat.getLessonCountPerWeek() + " ");
            out.print(courseFormat.getDateCreated());
            out.print(courseFormat.getDateCreated().toString().substring(0, 22));
            out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            close(out);
        }
    }

    @Override
    public CourseFormat[] findAll() throws IOException {
        PrintWriter out = null;
        CourseFormat[] courseFormats = new CourseFormat[count];
        try {
            Scanner sc = new Scanner(COURSE_FORMAT_FILE);
            for (int i = 0; sc.hasNextLine(); i++) {
                CourseFormat courseFormat = new CourseFormat();

                courseFormat.setId(sc.nextLong());
                courseFormat.setFormat(Format.valueOf(sc.next()));
                courseFormat.setDurationInWeek(sc.nextInt());
                courseFormat.setOnline(sc.nextBoolean());
                courseFormat.setLessonDuration(sc.nextInt());
                courseFormat.setLessonCountPerWeek(sc.nextInt());
                sc.nextLine();

                courseFormats[i] = courseFormat;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

    }finally

    {
        close(out);
    }
            return courseFormats;
}
            private int getCount() {
                int count=0;
                try {
                    Scanner scanner = new Scanner(COURSE_FORMAT_FILE);
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






