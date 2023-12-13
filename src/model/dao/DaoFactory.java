package model.dao;

import db.DB;
import model.entities.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
