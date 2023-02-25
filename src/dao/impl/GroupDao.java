package dao.impl;

import model.Group;
import model.Mentor;

public interface GroupDao {
    void save(Mentor mentor);

    void save(Group group);

    Group[] findAll();


}

