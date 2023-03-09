package createUser;

import Exeption.WrongCommandExeption;
import dao.impl.StudentDao;
import dao.impl.StudentDaoImpl;
import enums.ChooseUser;
import enums.Command;
import model.BaseEntity;
import model.Manager;
import model.Student;
import service.impl.Run;

import java.io.IOException;
import java.util.Scanner;

public class CreateCommandForUsers extends BaseEntity {
    Command command = null;
    ChooseUser chooseUser = null;

    public void Commands() throws IOException {


        loop: while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите комманду SAVE or FINDALL");

            command = Command.valueOf(sc.nextLine());

            switch (command) {
                case FINDALL : {
                    System.out.println("Пока не создали");
                    System.out.println();
                    break;
                }
                case SAVE : {

                    System.out.println("Выберите одного из пользователей  MANAGER OR STUDENT");
                    chooseUser = ChooseUser.valueOf(sc.nextLine());
                    switch (chooseUser) {
                        case MANAGER : {
                            ManagercreateUser managercreateUser = new ManagercreateUser();
                            managercreateUser.createManager();
                            break loop;
                        }

                        case STUDENT : {
                            StudentcreateUser studentcreateUser = new StudentcreateUser();
                            studentcreateUser.setUser();
                            break loop;
                        }
                    }
                    break loop;
                }
            }
            break loop;
        }
    }
}



//
//   // @Override
//    public void run() {
//
//    }
//}
