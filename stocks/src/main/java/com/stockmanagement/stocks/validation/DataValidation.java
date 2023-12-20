package com.stockmanagement.stocks.validation;

import com.stockmanagement.stocks.exception.InvalidDataException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {
    private static  final String STRING_REGEX = "^[A-Za-z\\s]+$";
    private static final  String NUMBER_REGEX = "^[6-9]\\d{10}$\n";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^\\da-zA-Z]).{7,}$\n";
    public static void stringValidation(String str ,String name , int n) throws InvalidDataException{
        if(str.length()>n)throw new InvalidDataException(name+" can't be more than "+n);
        if(str.isEmpty()) throw new InvalidDataException(name+" can't be empty");
        Pattern pat = Pattern.compile(STRING_REGEX);
        Matcher match = pat.matcher(str);
        if(!match.matches())throw  new InvalidDataException(name+" should only contains alphabets");
    }
    public static void vehicleValidation(int vehicle) throws InvalidDataException{
        if(vehicle < 2 || vehicle>4) throw new InvalidDataException("Invalid Vehicle");
    }
    public static void quantityValidation(int quantity) throws InvalidDataException{
        if(quantity<0) throw new InvalidDataException("quantity can't be 0 or less than 0");
    }
    public static void costValidation(int cost) throws InvalidDataException{
        if(cost<=0)throw new InvalidDataException("Cost cant be 0 or less than 0");

    }
    public static void numberValidation(long number) throws InvalidDataException{
        Pattern pat = Pattern.compile(NUMBER_REGEX);
        Matcher matcher =  pat.matcher(Long.toString(number));
        if(!matcher.matches())throw new InvalidDataException("Invalid Number");
    }
    public static void emailValidation(String email) throws InvalidDataException{
        Pattern pat = Pattern.compile(EMAIL_REGEX);
        Matcher matcher =  pat.matcher(email);
        if(!matcher.matches())throw new InvalidDataException("Invalid Email ");
    }
    public static void passwordValidation(String pass) throws InvalidDataException{
        Pattern pat = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher =  pat.matcher(pass);
        if(!matcher.matches())throw new InvalidDataException("Invalid password");
    }


}
