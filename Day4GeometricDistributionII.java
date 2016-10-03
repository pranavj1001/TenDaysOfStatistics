package com.TenDaysOfStatistics;

import java.util.*;

public class Day4GeometricDistributionII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        float num,den;
        num = sc.nextFloat();
        den = sc.nextFloat();
        int n;
        n = sc.nextInt();
        float p = num/den;
        float q = 1 - p;
        float ans = (float) Math.pow((q),n);
        ans = 1 - ans;
        System.out.println( Math.round((ans )*1000.0)/1000.0 );
        sc.close();
    }
}
