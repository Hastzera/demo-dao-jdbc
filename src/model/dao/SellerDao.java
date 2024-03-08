package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void update(Seller obj);
    void insert(Seller obj);
    void deleteByUd(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
