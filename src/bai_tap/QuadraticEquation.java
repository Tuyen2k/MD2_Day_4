package bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation test = new QuadraticEquation(a, b, c);
        System.out.println("Value a: " + test.getA());
        System.out.println("Value b: " + test.getB());
        System.out.println("Value c: " + test.getC());
        System.out.println("Delta of QuadraticEquation: " + test.getDiscriminant());
        if (test.getDiscriminant() > 0 ){
            System.out.print("The equation has two \nRoot1: "+ test.getRoot1() + "\nRoot2: " + test.getRoot2());
        } else if (test.getDiscriminant() == 0) {
            System.out.print("The equation has one root: " + test.getRootUnique());
        }
        else {
            System.out.print("The equation no real root.");
        }
    }

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt((this.b * this.b - 4 * this.a * this.c))) / (2 * this.a);
    }

    public double getRootUnique(){
        return (-this.b/2*this.a);
    }
}
