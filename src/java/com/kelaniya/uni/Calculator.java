package com.kelaniya.uni;

import java.io.File;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) throws Exception  {

        Scanner num=new Scanner(new File("C:\\Users\\user\\Desktop\\Cal github Repo\\Calculator\\src\\java\\com.kelaniya.uni\\numbers.txt"));

        System.out.println("Select an option:\n");
        System.out.println("1 for summation,2 for subtraction, 3 for multiplication. ");

        Scanner scanner=new Scanner(System.in);
        int selection=scanner.nextInt();

        if(selection==1)
        {
            summation(num);
        }else if(selection==2)
        {
            multiplication(num);
        }else if(selection==3)
        {
            divition(num);
        }else{
            System.out.println("Invalid selection!");
        }


    }

    static void summation(Scanner scanner) {
        int sum=0;
        int x=0;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            sum=sum+nextInt;
            x++;
        }
        System.out.println("Summation:"+sum);
    }

    static void multiplication(Scanner scanner) {
        int x=0;
        int mul=1;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            mul=mul*nextInt;
            x++;
        }
        System.out.println("Multiplication:"+mul);
    }

    static void divition(Scanner scanner) {
        double div= scanner.nextInt();
        int x=0;

        while (scanner.hasNextInt()){
            int nextInt=scanner.nextInt();
            div=div/nextInt;
            x++;
        }
        System.out.println("Division:"+div);
    }


}