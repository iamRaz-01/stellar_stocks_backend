package com.stockmanagement.stocks.model;


import com.stockmanagement.stocks.exception.InvalidDataException;
import com.stockmanagement.stocks.validation.DataValidation;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int userId ;

    private long phone;

    private String name ;

    private String email;

    private String pass ;

    private int role ;


    public void setName(String name) throws InvalidDataException {
        DataValidation.stringValidation(name,"name",25);
        this.name = name;
    }
    public void setNumber(long number)throws InvalidDataException{
        DataValidation.numberValidation(number);
        this.phone =  number;
    }
    public void setEmail (String email) throws InvalidDataException{
        DataValidation.emailValidation(email);
        this.email =  email;
    }
    public void setPass(String password) throws InvalidDataException{
        DataValidation.passwordValidation(password);
        this.pass =  password;
    }
    public void setUserId(int id){
        this.userId = id;
    }

    public long getPhone() {
        return phone;
    }

    public int getUserId() {
        return userId;
    }

    public int getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
