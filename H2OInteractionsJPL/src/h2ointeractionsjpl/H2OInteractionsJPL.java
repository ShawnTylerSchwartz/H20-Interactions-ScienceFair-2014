package h2ointeractionsjpl;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Shawn Tyler Schwartz
 * @school High Tech Los Angeles
 * @advisors Dr. William N. Warner, Wun Chiou, & Daniel Perahya
 * @location Jet Propulsion Laboratory, Pasadena CA (JPL)
 * @fileName "H2OInteractionsJPL.java" (Main Class)
 * @version 2.0 - 2014 LA County Science Fair Edition
 **/

public class H2OInteractionsJPL {

    /**
     * @param args the command line arguments
     */
       Double[][] A = { { 4.00, 3.00 }, { 2.00, 1.00 } };
         Double[][] B = { { -0.500, 1.500 }, { 1.000, -2.0000 } };

    
    //Coordinate Arrays
    public static double initialLeftHydrogenCoord[];
    public static double initialOxygenCoord[];
    public static double initialRightHydrogenCoord[];
    public static double initialMoleculeCoordArray[][];
    
    public static double finalLeftHydrogenCoord[];
    public static double finalOxygenCoord[];
    public static double finalRightHydrogenCoord[];
    public static double finalMoleculeCoordArray[][];
    
    //Coordinate Values
    public static double initialLeftHydrogenXPos;
    public static double initialLeftHydrogenYPos;
    
    public static double initialOxygenXPos;
    public static double initialOxygenYPos;
    
    public static double initialRightHydrogenXPos;
    public static double initialRightHydrogenYPos;
    
    
    public static double finalLeftHydrogenXPos;
    public static double finalLeftHydrogenYPos;
    
    public static double finalOxygenXPos;
    public static double finalOxygenYPos;
    
    public static double finalRightHydrogenXPos;
    public static double finalRighyHydrogenYPos;
    
    //Rotational Flux Constants
    public static double generatedRotationAngle; //radians
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double start = 0.0;
        double end = Math.toRadians(2*Math.PI);
        double randomMolONE = new Random().nextDouble();
//        generatedRotationAngle = start + (randomMolONE * (end - start)); //old random gen -- needs to be fixed
        generatedRotationAngle = Math.PI;
        sopl("\n\nRandom Angle Molecule One: " + generatedRotationAngle);

//        rotationAboutXYZMatrix(randomThetaMolONE, randomThetaMolTWO); //(theta)
//        
//            finalRotLeftHydrogenOneXPos = finalRotatedZArrayOne[0][0];
//            finalRotLeftHydrogenOneYPos = finalRotatedZArrayOne[0][1];

        
            initialLeftHydrogenCoord = new double[2];
            initialOxygenCoord = new double[2];
            initialRightHydrogenCoord = new double[2];
            
            finalLeftHydrogenCoord = new double[2];
            finalOxygenCoord = new double[2];
            finalRightHydrogenCoord = new double[2];
            
            //Initial Position of First Water Molecule in System
            initialLeftHydrogenCoord[0] = -79.07;
            initialLeftHydrogenCoord[1] = 61.22;

            initialOxygenCoord[0] = 0;
            initialOxygenCoord[1] = 0;

            initialRightHydrogenCoord[0] = 79.07;
            initialRightHydrogenCoord[1] = 61.22;
            
            //Final Position of First Water Molecule in System
            finalLeftHydrogenCoord[0] = (initialLeftHydrogenXPos * Math.cos(generatedRotationAngle)) - (initialLeftHydrogenYPos * Math.sin(generatedRotationAngle));
            finalLeftHydrogenCoord[1] = (initialLeftHydrogenXPos * Math.sin(generatedRotationAngle)) + (initialLeftHydrogenYPos * Math.sin(generatedRotationAngle));
            
            finalOxygenCoord[0] = (initialOxygenXPos * Math.cos(generatedRotationAngle)) - (initialOxygenYPos * Math.sin(generatedRotationAngle));
            finalOxygenCoord[1] = (initialOxygenYPos * Math.sin(generatedRotationAngle)) + (initialOxygenYPos * Math.cos(generatedRotationAngle));
            
            finalRightHydrogenCoord[0] = (initialRightHydrogenXPos * Math.cos(generatedRotationAngle)) - (initialRightHydrogenYPos * Math.sin(generatedRotationAngle));
            finalRightHydrogenCoord[1] = (initialRightHydrogenXPos * Math.sin(generatedRotationAngle)) - (initialRightHydrogenYPos * Math.cos(generatedRotationAngle));
            
            
            System.out.println("\nInitial Left Hydrogen Coordinate" + Arrays.toString(initialLeftHydrogenCoord));
            System.out.println("Final Left Hydrogen Coordinate" + Arrays.toString(finalLeftHydrogenCoord));
            
            System.out.println("\nInitial Oxygen Coordiante" + Arrays.toString(initialOxygenCoord));
            System.out.println("Final Oxygen Coordinate" + Arrays.toString(finalOxygenCoord));
            
            System.out.println("\nInitial Right Hydrogen Coordinate" + Arrays.toString(initialRightHydrogenCoord));
            System.out.println("Final Right Hydrogen Coordinate" + Arrays.toString(finalRightHydrogenCoord));
            
            
            //Test double Matrix -- TODO:// Need to make a 2X1 multiplyer instead of a 2X2
            H2OInteractionsJPL matrix = new H2OInteractionsJPL();
            Double[][] result = multiplicar(matrix.A, matrix.B);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
    }
            
    }
    
    public static Double[][] multiplicar(Double[][] A, Double[][] B) {
    
     int aRows = A.length;
        int aColumns = A[0].length;
        int bRows = B.length;
        int bColumns = B[0].length;

        if (aColumns != bRows) {
            throw new IllegalArgumentException("A:Rows: " + aColumns + " did not match B:Columns " + bRows + ".");
        }

        Double[][] C = new Double[aRows][bColumns];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0.00000;
            }
        }

        for (int i = 0; i < aRows; i++) { // aRow
            for (int j = 0; j < bColumns; j++) { // bColumn
                for (int k = 0; k < aColumns; k++) { // aColumn
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
    
     private static void sopl(String userInput){
            System.out.println(userInput);
     }
     
     public static void matrixSolver(double x, double y) {
      
     }
     
     
     
     
//     public static void calculateInitialCoordinates(double bondlength, double bondangle, double moleculetype) {
//         
//     }

    ////TODO: Make trig "calculateInitialCoordinates function so starting position generation can be dynamic
}
