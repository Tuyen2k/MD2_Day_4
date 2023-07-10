package thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double w = input.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double h = input.nextDouble();
        Rectangle testRec = new Rectangle(w, h);
        System.out.println("The rectangle: \n" + testRec.displayRectangle());
        System.out.println("Are of rectangle: " + testRec.getArea());
        System.out.println("Perimeter of rectangle: "+ testRec.getPerimeter());

    }

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String displayRectangle() {
        return "Rectangle {" + " width= " + width + ", height= " + height + " }";
    }

}
