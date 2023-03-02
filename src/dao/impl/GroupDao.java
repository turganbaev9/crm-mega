package dao.impl;

import dao.CrudDao;
import model.Group;
import model.Mentor;

import java.io.IOException;

public interface GroupDao extends CrudDao {
    void save(Mentor mentor);

    void save(Group group) throws IOException;

    Group[] findAll() throws IOException;


}

