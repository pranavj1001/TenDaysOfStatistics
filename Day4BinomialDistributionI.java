package com.TenDaysOfStatistics;

import java.util.*;

public class Day4BinomialDistributionI {

    
    
     public static double  bernoulli (double p , double i  ) {
            
         p = (Math.pow(p, i))* ((Math.pow(p+1, -i)));

         return Math.rint(p*1000)/1000 ;
    
     }
    
             
    
     public static double  binomial (int n, int x,double p   ) {
                 
                double combination_N=1;
                for(int i=1;i<=n;i++)
                { combination_N*=(double)i;}
                            
                double combination_D1=1;
                for(int i=1;i<=x;i++)
                { combination_D1*=(double)i;}
                                 
                double combination_D2=1;
                for(int i=1;i<=(n-x);i++)
                { combination_D2*=(double)i;}

                double resultado =(combination_N /(combination_D1*combination_D2 ))*(Math.pow(p, x))* (Math.pow((1-p), (n-x)));

     
                return Math.rint(resultado*1000)/1000 ;
    
      }
    


     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        double n = sc.nextDouble();
        double i = sc.nextDouble();


        double p =bernoulli (n , i);

        double combination3  =binomial (6, 3, p );
        double combination4  =binomial (6, 4, p );
        double combination5  =binomial (6, 5, p );
        double combination6  =binomial (6, 6, p );

        System.out.println((combination3+combination4+combination5+combination6) );
         
        sc.close();

    }

}
