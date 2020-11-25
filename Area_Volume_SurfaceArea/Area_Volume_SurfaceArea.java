/* Area_Volume_SurfaceArea.java
Area, Volume, and Surface Area calculating program for CSCI 111-900
Last edited by Pat Doyle 10/22/19
 */

import java.util.Scanner;
import java.lang.Math;  // Import classes necessary to program.
import java.util.Scanner;

public class Area_Volume_SurfaceArea {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter distance. "); // Creates Scanner and prompts user for its value.

        double distance = scnr.nextDouble();
        double area_circle = Math.PI * Math.pow(distance,2);    // Defining variables with corresponding equations.
        double area_square = Math.pow(distance,2);              // surfarea = surface area
        double volume_sphere = (4/3) * Math.PI * Math.pow(distance,2);
        double volume_cube = Math.pow(distance,3);
        double surfarea_sphere = 4 * Math.PI * Math.pow(distance,2);
        double surfarea_cube = 6 * Math.pow(distance,2);

        System.out.println("The area of a circle with that radius: " + area_circle);
        System.out.println("The area of a square with that side: " + area_square);
        System.out.println("The volume of a sphere with that radius: " + volume_sphere);
        System.out.println("The volume of a cube with that side: " + volume_cube);
        System.out.println("The surface area of a sphere with that radius: " + surfarea_sphere);
        System.out.println("The surface area of a cube with that side: " + surfarea_cube);

        //Prints values for user given distance







    }
}
