package dao.impl;

import dao.CrudDao;
import model.Course;
import model.CourseFormat;
import model.Group;

import java.io.IOException;

public interface CoursesDao extends CrudDao {

        Course[] findAll();

        void save(Course course) throws IOException;
}
