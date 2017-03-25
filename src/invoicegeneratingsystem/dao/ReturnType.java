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
public class ReturnType {
    private String[] name;
    private String[][] values;
    
    public ReturnType(String[] name, String[][] values)
    {
        this.name = name;
        this.values = values;
    }

    public String[] getName() {
        return name;
    }

    public String[][] getValues() {
        return values;
    } 
}
