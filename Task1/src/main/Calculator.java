package main;

import java.util.Scanner;

public class Calculator {

  // Exercise Task
  // 1 a)
  public static double add(double a, double b) {
    // TODO: fill me
    return a + b;
  }

  // Exercise Task
  // 1 b)
  public static double subtract(double a, double b) {
    // TODO: fill me
    return a - b;
  }

  // Exercise Task
  // 1 c)
  public static double multiply(double a, double b) {
    // TODO: fill me
    return a * b;
  }

  // Exercise Task
  // 1 d)
  public static double maximum(double a, double b) {
    // TODO: fill me
	return (a > b) ? a : b;
  }

  // Exercise Task
  // 1 e)
  public static double divide(double a, double b) {
    // TODO: fill me
    if (b == 0)
    {
    	return -1;
    }
    else
    {
    	return a / b;
    }
  }

  // Exercise Task
  // 1 f)
  public static double circle_area(double r) {
    // TODO: fill me
    return Math.PI*r*r;
  }

  // Exercise Task
  // 1 g)
  public static double rectangle_perimeter(double a, double b) {
    // TODO: fill me
    return 2*a + 2*b;
  }

  // Exercise Task
  // 1 h)
  public static double numericalGradient(double x){
    // TODO: fill me
    // note (log(x))' = 1 / x
    double h = Math.pow(10, -5);
	return (Math.log(x+h)-Math.log(x-h))/(2*h);
  }

  // Exercise Task
  // 1 i)
  public static double earth_distance(double latitude1, double longitude1, double latitude2, double longitude2){
    latitude1 = Math.toRadians(latitude1);
    longitude1 = Math.toRadians(longitude1);
    latitude2 = Math.toRadians(latitude2);
    longitude2 = Math.toRadians(longitude2);
    int r = 6371;
    // TODO: fill me
    return r*Math.acos(Math.sin(latitude1)*Math.sin(latitude2)+Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude1 - longitude2));
  }

  public static void main(String[] args) {
    // you do not need to touch anything here.
    boolean repeat = true;
    while(repeat){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Wilkommen beim Taschenrechner!");
      System.out.println("Men�");
      System.out.println("Addition                   (1)");
      System.out.println("Subtraction                (2)");
      System.out.println("Multiplikation             (3)");
      System.out.println("Maximum                    (4)");
      System.out.println("Division                   (5)");
      System.out.println("Kreisfl�che                (6)");
      System.out.println("Umfang Rechteck            (7)");
      System.out.println("Numerische Ableitung       (8)");
      System.out.println("Abstand auf Erdoberfl�che  (9)");
      System.out.println("Exit                       (0)");

      int operation = scanner.nextInt();
      double result = 0;

      double a, b, r, x;

      switch(operation){
        case 0:
          repeat = false;
          break;
        case 1:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.add(a, b);
          break;
        case 2:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.subtract(a, b);
          break;
        case 3:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.multiply(a, b);
          break;
        case 4:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.maximum(a, b);
          break;
        case 5:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.divide(a, b);
          break;
        case 6:
          System.out.println("Bitte gib einen Wert fuer r ein:");
          r = scanner.nextDouble();

          result = Calculator.circle_area(r);
          break;
        case 7:
          System.out.println("Bitte gib einen Wert fuer a ein:");
          a = scanner.nextDouble();

          System.out.println("Bitte gib einen Wert fuer b ein:");
          b = scanner.nextDouble();

          result = Calculator.rectangle_perimeter(a, b);
          break;
        case 8:
          System.out.println("Bitte gib einen Wert fuer x ein:");
          x = scanner.nextDouble();

          result = Calculator.numericalGradient(x);
          break;
        case 9:
          System.out.println("Bitte gib einen Wert fuer latitude1 ein:");
          double latitude1 = scanner.nextDouble();
          System.out.println("Bitte gib einen Wert fuer longitude1 ein:");
          double longitude1 = scanner.nextDouble();
          System.out.println("Bitte gib einen Wert fuer latitude2 ein:");
          double latitude2 = scanner.nextDouble();
          System.out.println("Bitte gib einen Wert fuer longitude2 ein:");
          double longitude2 = scanner.nextDouble();

          result = Calculator.earth_distance(latitude1, longitude1, latitude2, longitude2);
          break;
        default:System.out.println("Bitte wähle eine gültige Operation!");
          break;
      }

      if (operation != 0){
        System.out.println("Das Ergebnis ist:");
        System.out.println(result);
        System.out.println("");
        System.out.println("");
      }


    }
  }

}
