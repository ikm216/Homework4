package geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Linked_List<Geometry2D> geometry2DList = new Linked_List<>();
        Linked_List<Geometry3D> geometry3DList = new Linked_List<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Geometry");
            System.out.println("2. Remove Geometry");
            System.out.println("3. Find Area or Perimeter for 2D Geometry");
            System.out.println("4. Find Volume or Surface Area for 3D Geometry");
            System.out.println("5. Display All Geometries");
            System.out.println("6. Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Choose type (2D or 3D): ");
                    String type = scan.next();
                    if (type.equalsIgnoreCase("2D")) {
                        System.out.println("Enter Rectangle, Circle, or Triangle: ");
                        String shape = scan.next();
                        if (shape.equalsIgnoreCase("Rectangle")) {
                            System.out.print("Enter length and width: ");
                            double len = scan.nextDouble();
                            double wid = scan.nextDouble();
                            geometry2DList.add(new Rectangle(len, wid));
                        } else if (shape.equalsIgnoreCase("Circle")) {
                            System.out.print("Enter radius: ");
                            double rad = scan.nextDouble();
                            geometry2DList.add(new Circle(rad));
                        } else if (shape.equalsIgnoreCase("Triangle")) {
                            System.out.print("Enter base and height: ");
                            double b = scan.nextDouble();
                            double h = scan.nextDouble();
                            geometry2DList.add(new Triangle(b, h));
                        }
                    } else if (type.equalsIgnoreCase("3D")) {
                        System.out.println("Enter Sphere or TriangularPrism: ");
                        String shape = scan.next();
                        if (shape.equalsIgnoreCase("Sphere")) {
                            System.out.print("Enter radius: ");
                            double rad = scan.nextDouble();
                            geometry3DList.add(new Sphere(rad));
                        } else if (shape.equalsIgnoreCase("TriangularPrism")) {
                            System.out.print("Enter base, height, and length: ");
                            double b = scan.nextDouble();
                            double h = scan.nextDouble();
                            double len = scan.nextDouble();
                            geometry3DList.add(new TriangularPrism(b, h, len));
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Remove is not implemented in detail. Skipping.");
                }
                case 3 -> {
                    System.out.println("Choose 2D Geometry index to calculate:");
                    geometry2DList.displayAll();
                    int index = scan.nextInt();
                    Geometry2D geometry = geometry2DList.find(index);
                    if (geometry != null) {
                        System.out.println("Area: " + geometry.area());
                        System.out.println("Perimeter: " + geometry.perimeter());
                    } else {
                        System.out.println("Invalid index.");
                    }
                }
                case 4 -> {
                    System.out.println("Choose 3D Geometry index to calculate:");
                    geometry3DList.displayAll();
                    int index = scan.nextInt();
                    Geometry3D geometry = geometry3DList.find(index);
                    if (geometry != null) {
                        System.out.println("Volume: " + geometry.volume());
                        System.out.println("Surface Area: " + geometry.surfaceArea());
                    } else {
                        System.out.println("Invalid index.");
                    }
                }
                case 5 -> {
                    System.out.println("Displaying all geometries:");
                    System.out.println("2D Geometries:");
                    geometry2DList.displayAll();
                    System.out.println("3D Geometries:");
                    geometry3DList.displayAll();
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}