package com.TenDaysOfStatistics;

import java.util.*;

public class Day4GeometricDistributionI {

     public static double  DisGeo (int  x , double p  ) 
     {
        p =  (Math.pow((1-p), (x-1))) * p;
        return p ;
     }

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);              
         int n = scan.nextInt();
         int f = scan.nextInt();
         int x  = scan.nextInt();
         scan.close();
         double p = (double)n/f;
         double resultadoGeo  =DisGeo (x, p );
         System.out.println( Math.round((resultadoGeo )*1000.0)/1000.0 );
    }

}
