/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicegeneratingsystem;

/**
 *
 * @author user
 */
public interface IDaoPattern {
    public void insertCustomerDetails(String id, String title, String first, String last, String add, String number, String packageType);
}
