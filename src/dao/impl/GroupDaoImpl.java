package dao.impl;

import model.Group;
import model.Mentor;

import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;

public class GroupDaoImpl implements  GroupDao {

    private final String PATH_FILE = "C:\\Users\\user\\Documents\\intelidij projects\\crm-mega\\lib\\Group.txt";
    private final File GROUP_FILE = new File(PATH_FILE);

    public GroupDaoImpl() {
        boolean isCreated = false;
        if (!GROUP_FILE.exists()) {
            try {
                isCreated = GROUP_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("новый документ создан");
        }


    }

    @Override
    public void save(Mentor mentor) {


    }

    @Override
    public void save(Group group) throws IOException {
        PrintWriter out=null;
        try {
            out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
out.print(group.getName() + " " );
out.print(group.getRoom()+ " " );
out.print(group.getStartTime() + "  " );

            out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
        close(out);
    }

    }

    @Override
    public Group[] findAll() {
        Group[] groups = new Group[100];
        try {
            Scanner scanner = new Scanner(GROUP_FILE);
            for (int i = 0; scanner.hasNextLine(); i++) {
                Group group = new Group();
                group.setName(scanner.next());
                group.setRoom(scanner.next());
                //group.setStartTime(LocalTime.parse(scanner.nextLine().substring(1)));
                groups[i] = group;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            {
            //    close(out);


            }

        }
        return groups;
    }
}