package model.dao.impl;

import model.dao.SellerDao;

public interface DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
