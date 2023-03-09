package dao.impl;

import model.CourseFormat;

import java.io.IOException;


public interface CourseFormatDao extends  CrudDao{

        void save(CourseFormat courseFormat) throws IOException;

        CourseFormat[] findAll() throws IOException;


}