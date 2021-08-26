package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    //SOLID PRINCIPLES -->>ALL SOLID PRINCIPLES ARE VIOLATED HERE!!!!
    public static void main(String[] args) throws IOException {

        //Make sure to validate the arguments before using
        if(args.length==0){
            System.out.println("Please provide the operation as an argument");
            return;
        }
        String operator=args[0];

        if(operator.equals("add")||operator.equals("sub")||operator.equals("mul")){
            System.out.println("Please provide add,sub or mul as the operator argument");
            return;
        }

        //Read the numbers text file
        List<String> numbersStrs= Files.readAllLines(Paths.get("C:\\Users\\user\\Desktop\\Software construction git repo\\calculator\\src\\java\\com\\kelaniya\\uni\\numbers.txt"));
        int number1=Integer.parseInt(numbersStrs.get(0));
        int number2=Integer.parseInt(numbersStrs.get(1));
        double result=0;
        if(operator.equals("add")){
            result=number1+number2;

        }else if(operator.equals("sub")){
            result=number1-number2;

        }else if(operator.equals("mul")){
            result=number1*number2;

        }

        System.out.println("The result is"+result);

    }
}
