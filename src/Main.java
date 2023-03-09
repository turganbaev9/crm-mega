import createUser.CreateCommandForUsers;
import createUser.ManagercreateUser;
import createUser.StudentcreateUser;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws IOException {

            CreateCommandForUsers createCommandForUsers =new CreateCommandForUsers();
            createCommandForUsers.Commands();
            ManagercreateUser managercreateUser=new ManagercreateUser();
            managercreateUser.createManager();
            StudentcreateUser studentcreateUser=new StudentcreateUser();
            studentcreateUser.setUser();


//            ArrayList<Integer>arrayList = new ArrayList<>();
//            for (int i = 0; i <100 ; i++) {
//               arrayList.add((int) (Math.random()*100+1));
//                System.out.println(arrayList);
         // int[] count=new int[




        //    System.out.println(Arrays.toString(courseFormatDao.findAll()));

        }
}