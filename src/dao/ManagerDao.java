package dao;

import model.Manager;

import java.io.IOException;

public interface ManagerDao {
    void save(Manager manager);
Manager[] findAll();



}
