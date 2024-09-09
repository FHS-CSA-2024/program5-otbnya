//import stuff here?

import java.util.Scanner;

//Your code here

public class Program5 {
    public static void min (String [] args) {
        //Make a Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Variables
        int Rmiles = 286;
        int Rgallons = 9;
        int KKmiles = 412;
        int KKgallons = 40;
        int PFmiles = 361;
        int PFgallons = 18;
        int Bmiles = 161;
        int Bgallons = 11;
        
        double Rmpg = Rmiles/Rgallons;
        double KKmpg = KKmiles/KKgallons;
        double PFmpg = PFmiles/PFgallons;
        double Bmpg = Bmiles/Bgallons;
        
        Rmpg = Math.round(Rmpg*10.0)/10.0;
        KKmpg = Math.round(KKmpg*10.0)/10.0;
        PFmpg = Math.round(PFmpg*10.0)/10.0;
        Bmpg = Math.round(Bmpg*10.0)/10.0;
        
        //output
        System.out.println ("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println();
        System.out.println ("Royale averaged " + Rmpg);
        System.out.println();
        System.out.println("Koopa King averaged " + KKmpg);
        System.out.println();
        System.out.println("Pipe Frame averaged " + PFmpg);
        System.out.println();
        System.out.println("Badwagon averaged " + Bmpg);
        
    }
}



//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.0

Koopa King averaged 10.0

Pipe Frame averaged 20.0

Badwagon averaged 14.0

*/


