package createUser;

import dao.impl.MentorDaoImpl;
import model.Mentor;

import java.util.Scanner;

public class MentorcreateUser extends Mentor {
    public  void CreateMentor(){
  Mentor mentor =new Mentor();
        MentorDaoImpl mentorDao=new MentorDaoImpl();
        Scanner sc=new Scanner(System.in);
        mentor.setName(sc.next());
        mentor.setSurName(sc.next());
        mentor.setPhone(sc.next());
        mentor.setEmail(sc.next());

    }
}
