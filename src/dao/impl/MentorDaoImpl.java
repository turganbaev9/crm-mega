package dao.impl;

import dao.MentorDao;
import model.Mentor;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MentorDaoImpl implements MentorDao {


    private final String PATH_FILE="C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\Mentor.txt";
    private final File MENTOR_FILE = new File(PATH_FILE);
   public MentorDaoImpl(){
boolean isCreated=false;
if (!MENTOR_FILE.exists()){
        try {
            isCreated=MENTOR_FILE.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
if (isCreated){
    System.out.println("новый документ создан");
}



   }
    @Override
    public void save(Mentor mentor) throws IOException {
       PrintWriter out=null;
        try {
                 out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
                out.print(mentor.getId());
out.print(mentor.getName() + " " );
out.print(mentor.getSurName() + " " );
out.print(mentor.getEmail() + " " );
out.print(mentor.getPhone() + " " );
out.print(mentor.getSalaryforlesson() + " " );
out.print(mentor.getExperience() + " " );
out.print(mentor.getDateCreated() + " " );
out.println();
out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
        close(out);
    }

    }

    @Override
    public Mentor[] findAll() throws IOException {
        PrintWriter out=null;
        Mentor[]mentors=new Mentor[100];
        try {
            Scanner scanner=new Scanner(MENTOR_FILE);
            for (int i = 0; scanner.hasNextLine(); i++) {
                Mentor mentor=new Mentor();
                mentor.setId(scanner.nextLong());
                mentor.setName(scanner.next());
                mentor.setSurName(scanner.next());
                mentor.setEmail(scanner.next());
                mentor.setPhone(scanner.next());
                mentor.setExperience(scanner.nextDouble());
                mentor.setDateCreated(LocalDateTime.parse(scanner.nextLine().substring(1)));
            mentors[i]=mentor;
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
            }finally {
        close(out);
    }


        return mentors;
    }
}
