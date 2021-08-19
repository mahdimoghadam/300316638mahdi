package com.example._300316638mahdi;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {
    public void add(Loan loan) throws SQLException, ClassNotFoundException;
    public Loan edit(Loan loan, String clientno) throws SQLException, ClassNotFoundException;
    public void delete(String clientno) throws SQLException, ClassNotFoundException;
    public List<Loan> display() throws SQLException, ClassNotFoundException;

}