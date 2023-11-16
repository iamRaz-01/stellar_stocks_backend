package com.stockmanagement.stocks.validation;

import com.stockmanagement.stocks.exception.InvalidDataException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {
    private static  final String STRING_REGEX = "^[A-Za-z\\s]+$";
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

}
