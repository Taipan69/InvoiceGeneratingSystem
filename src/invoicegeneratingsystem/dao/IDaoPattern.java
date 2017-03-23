/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicegeneratingsystem.dao;

/**
 *
 * @author user
 */
public interface IDaoPattern {

    public void insertCustomerDetails(String id, String title, String first, String last, String add, String number, String packageType);

    public void insertInvoiceDetails(String invoiceNumber, String invoiceDate, String customerID);

    public void insertRentInfomation1(String CarID, String Kilometreshr, String Durationhr, String Renthr, String Total, String invoiceNumber);

    public void insertTransactionsInfomation4(String discount, String total, String amountpaid, String amountdue,String invoiceNumber);
}
