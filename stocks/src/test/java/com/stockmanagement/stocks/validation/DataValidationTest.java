package com.stockmanagement.stocks.validation;


import com.stockmanagement.stocks.exception.InvalidDataException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DataValidationTest {
     @Test
    void invalidStringValidationTest(){
         InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.stringValidation("abd123","name",30));
         assertEquals("name should only contains alphabets",exception.getMessage());
     }
    @Test
    void stringLengthValidationTest(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.stringValidation("abd123","name",3));
        assertEquals("name can't be more than 3",exception.getMessage());
    }
    @Test
    void emptyStringValidationTest(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.stringValidation("","name",3));
        assertEquals("name can't be empty",exception.getMessage());
    }
    @Test
    void vehicleValidationTest(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.vehicleValidation(1));
        assertEquals("Invalid Vehicle",exception.getMessage());
    }
    @Test
    void vehicleValidationTest2(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.vehicleValidation(5));
        assertEquals("Invalid Vehicle",exception.getMessage());
    }
    @Test
    void quantityValidationTest(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.quantityValidation(-1));
        assertEquals("quantity can't be 0 or less than 0",exception.getMessage());
    }
    @Test
    void quantityValidationTest2(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.quantityValidation(-10));
        assertEquals("quantity can't be 0 or less than 0",exception.getMessage());
    }
    @Test
    void costValidationTest(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.costValidation(-1));
        assertEquals("Cost cant be 0 or less than 0",exception.getMessage());
    }
    @Test
    void costValidationTest2(){
        InvalidDataException exception =  assertThrows(InvalidDataException.class,()->DataValidation.costValidation(-10));
        assertEquals("Cost cant be 0 or less than 0",exception.getMessage());
    }




}
