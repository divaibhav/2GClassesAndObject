/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 17-Aug-20
 *  Time: 3:35 PM
 */
package customclass;

public class Rectangle {
    //instance variables
    private int length;
    private int width;
    //defining constructors
    //no-argument constructor
    public Rectangle(){

        length = 0;
        width = 0;
    }
    //parameterized constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }










    //getter and setter
    //getter for length
    public int getLength(){
        return length;
    }
    //getter for width
    public int getWidth(){
        return width;
    }

    //setter
    //setter for length
    public void setLength(int length){
        this.length = length;
    }
    //setter for width
    public void setWidth(int width){
        this.width = width;
    }

    //behaviour or method

    public int area(){
        int response = 0;
        response = length * width;
         return response;
    }
    public int perimeter(){
        int response = 0;
        response = 2*(length + width);
        return response;
    }
}
