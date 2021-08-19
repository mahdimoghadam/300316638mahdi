package com.example._300316638mahdi;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService implements DatabaseInterface {

    Connection con;

    public DatabaseService(Connection con) {
        this.con = con;
    }


    @Override
    public void add(Loan loan) throws SQLException, ClassNotFoundException {

        String query= "INSERT INTO loantable VALUES (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(query);

        stmt.setString(1, loan.getClientno());
        stmt.setString(2, loan.getClientname());
        stmt.setDouble(3, loan.getLoanamount());
        stmt.setInt(4, loan.getYears());
        stmt.setString(5, loan.getLoantype());


        stmt.executeUpdate();
    }

    @Override
    public Loan edit(Loan loan, String clientno) throws SQLException, ClassNotFoundException {
        PreparedStatement query;
        query = con.prepareStatement("Update loantable set clientno=?, clientname=?, loanamount=?, years=?, loantype=? where clientno=?");
        query.setString(1, loan.getClientno());
        query.setString(2, loan.getClientname());
        query.setDouble(3, loan.getLoanamount());
        query.setInt(4, loan.getYears());
        query.setString(5, loan.getLoantype());
        query.setString(6, clientno);
        query.executeUpdate();
        return loan;
    }

    @Override
    public void delete(String clientno) throws SQLException, ClassNotFoundException {
        PreparedStatement query = con.prepareStatement("DELETE from loantable where clientno=?");
        query.setString(1,clientno);
        query.executeUpdate();
    }

    @Override
    public List<Loan> display() throws SQLException, ClassNotFoundException {
        List<Loan> LoanList = new ArrayList<Loan>();

        String quer1 = "Select * from loantable";

        PreparedStatement query = con.prepareStatement(quer1);

        ResultSet rs = query.executeQuery();

        Loan obj1;

        //display records if there is data;

        while (rs.next()) {

            obj1 = new Loan(rs.getString("clientno"), rs.getString("clientname"), rs.getDouble("loanamount"), rs.getInt("years"), rs.getString("loantype"));

            LoanList.add(obj1);
        }


        return LoanList;
    }

    public Loan search(String clientNo) throws SQLException,ClassNotFoundException {

        String quer1 = "Select * from loantable where clientno = ?";

        PreparedStatement query = con.prepareStatement(quer1);
        query.setString(1, clientNo);
        ResultSet rs = query.executeQuery();

        if(!rs.first()){

            System.out.print("Record not existing");
            return null;
        }

        Loan obj1=null;

        obj1 = new Loan(rs.getString("clientno"), rs.getString("clientname"), rs.getDouble("loanamount"), rs.getInt("years"), rs.getString("loantype"));

        return obj1;

    }
}
