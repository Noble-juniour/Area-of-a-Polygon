package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print( "input the sides of the polygon: "  );
        int n = reader.nextInt();
        System.out.print( " input the length of the sides of the polygon: " );
        int s = reader.nextInt();
        //int n = 7;
        //int s = 6;
        //double Area  = (n*(s*s))/(4*tan(3.14/n));
        //System.out.println("The area is: " + Area);
        System.out.print( "The area is : "  + area(n ,s ) );
    }
    public  static double area( int n , int s )
    {
        n = 7;
        s = 6;
        return (n*(s*s))/(4*tan(3.14/n));
    }
}
