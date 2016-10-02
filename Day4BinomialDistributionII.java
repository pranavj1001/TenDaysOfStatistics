package com.TenDaysOfStatistics;

import java.util.*;

public class Day4BinomialDistributionII {

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
           return resultado; 
    
     }
    


    public static void main(String[] args) {

           Scanner sc = new Scanner(System.in); 
           double STDIN = sc.nextDouble();
           int n = sc.nextInt();
           double p =STDIN/100;
          

           double combination0  =binomial (n, 0, p );
           double combination1  =binomial (n, 1, p );
           double combination2  =binomial (n, 2, p );
           double combination3  =binomial (n, 3, p );
           double combination4  =binomial (n, 4, p );
           double combination5  =binomial (n, 5, p );
           double combination6  =binomial (n, 6, p );
           double combination7  =binomial (n, 7, p );
           double combination8  =binomial (n, 8, p );
           double combination9  =binomial (n, 9, p );
           double combination10  =binomial (n, 10, p );

           System.out.println( Math.round((combination0+combination1+combination2 )*1000.0)/1000.0 );


           System.out.println( Math.round((combination2+combination3+combination4+combination5+combination6
                           +combination7+combination8+combination9+combination10 )*1000.0)/1000.0 );
           
           sc.close();
    }
}
