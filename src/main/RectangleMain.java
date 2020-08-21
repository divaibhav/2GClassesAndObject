/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 18-Aug-20
 *  Time: 1:08 PM
 */
package main;

import customclass.Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        //create an object Rectangle
        Rectangle obj = new Rectangle();//calling a constructor
        System.out.println("length = " + obj.getLength());
        System.out.println("width = " + obj.getWidth());

        //calling parameterized constructor
        Rectangle obj2 = new Rectangle(10,20);
        System.out.println("obj 2 - length = " + obj2.getLength());
        System.out.println("obj 2 - width = " + obj2.getWidth());

        //creating objects from user defined value
















        //Rectangle obj = new Rectangle();

        /*System.out.println("length =  " + obj.length);
        System.out.println("width = " + obj.width);

        obj.length = 10;
        obj.width = 20;
        System.out.println("length =  " + obj.length);
        System.out.println("width = " + obj.width);
        System.out.println("area = " + obj.area());
        System.out.println("perimeter = " + obj.perimeter());

        //using getter and setter for accessing private data member
        System.out.println("length = " + obj.getLength());
        System.out.println("width = " + obj.getWidth());

        //setting the value
        obj.setLength(10);
        obj.setWidth(20);
        System.out.println("length = " + obj.getLength());
        System.out.println("width = " + obj.getWidth());


         */
    }
}
