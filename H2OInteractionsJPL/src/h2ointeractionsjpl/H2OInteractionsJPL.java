package h2ointeractionsjpl;

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
        double end = Math.toRadians(360.0);
        double randomMolONE = new Random().nextDouble();
        generatedRotationAngle = start + (randomMolONE * (end - start));
        sopl("\n\nRandom Angle Molecule One: " + generatedRotationAngle);

        rotationAboutXYZMatrix(randomThetaMolONE, randomThetaMolTWO); //(theta)
    }
    
}
