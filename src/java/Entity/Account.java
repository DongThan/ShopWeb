/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ASUS
 */

public class Account {
    private int accountID;
    private String userName;
    private String password;
    private String type;
    private int employeeID;
    private String Image;

    public Account() {
    }

    public Account(String userName, String password, String type) {
        this.userName = userName;
        this.password = password;
        this.type = type;
    }

    public Account(int accountID, String userName, String password, String type, int employeeID, String Image) {
        this.accountID = accountID;
        this.userName = userName;
        this.password = password;
        this.type = type;
        this.employeeID = employeeID;
        this.Image = Image;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", userName=" + userName + ", password=" + password + ", type=" + type + ", employeeID=" + employeeID + ", Image=" + Image + '}';
    }

    
    
}
