package dao.impl;

import model.Course;

import java.io.IOException;

public interface CoursesDao extends CrudDao {

        Course[] findAll();

        void save(Course course) throws IOException;
}
