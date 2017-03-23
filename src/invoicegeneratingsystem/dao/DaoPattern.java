/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicegeneratingsystem.dao;

import invoicegeneratingsystem.MyDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DaoPattern implements IDaoPattern {

    MyDBConnection connection;
    Connection c;

    public DaoPattern() {
        connection = new MyDBConnection();
        connection.createConnection("jdbc:mysql://localhost:3306/invoicegeneratingsystem", "root", "Asdfghjkl1234567890");
        c = connection.getConnection();
    }

    @Override
    public void insertCustomerDetails(String id, String title, String first, String last, String add, String number, String packageType) {
        try {
            PreparedStatement statement = c.prepareStatement("insert into customer(id,title,firstName,lastName,address,phoneNumber,package) values(?,?,?,?,?,?,?)");
            statement.setString(1, id);
            statement.setString(2, title);
            statement.setString(3, first);
            statement.setString(4, last);
            statement.setString(5, add);
            statement.setString(6, number);
            statement.setString(7, packageType);
            int result = statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertInvoiceDetails(String invoiceNumber, String invoiceDate, String customerID) {
        try {
            PreparedStatement statement = c.prepareStatement("insert into invoice(Number,date,customer_id) values(?,?,?)");
            statement.setString(1, invoiceNumber);
            statement.setString(2, invoiceDate);
            statement.setString(3, customerID);
            int result = statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insertRentInfomation1(String CarID, String Kilometreshr, String Durationhr, String Renthr, String Total, String invoiceNumber) {
        try {
            PreparedStatement statement = c.prepareStatement("insert into rentinformation(Car_id, Kilometres, Duration, Rent, Total, Invoice_Number) values(?,?,?,?,?,?)");
            statement.setString(1, CarID);
            statement.setString(2, Kilometreshr);
            statement.setString(3, Durationhr);
            statement.setString(4, Renthr);
            statement.setString(5, Total);
             statement.setString(6, invoiceNumber);

            int result = statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoPattern.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   

    @Override
    public void insertTransactionsInfomation4(String discount, String total, String amountpaid, String amountdue, String invoiceNumber) {
        try {
            PreparedStatement statement = c.prepareStatement("insert into transactions(discount,total,amountpaid,amountdue,invoice_number) values(?,?,?,?,?)");
            statement.setString(1, discount);
            statement.setString(2, total);
            statement.setString(3, amountpaid);
            statement.setString(4, amountdue);
            statement.setString(5, invoiceNumber);
            int result = statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
