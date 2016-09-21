package com.TenDaysOfStatistics;

import java.util.*;

public class Day0WMean {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n, num = 0, den = 0;
        n = sc.nextInt();
        int[] X = new int[n];
        int[] W = new int[n];
        
        for(int i = 0; i < n; i++ ){
            X[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++ ){
            W[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++ ){
            num += (X[i]*W[i]);
            den += (W[i]);
        }
        
        try{
            System.out.printf("%.1f\n", (double)num/den);
        }catch(Exception e){
            System.out.println("something/0 caught, Bad Input!");
        }
        
        sc.close();
        
    }
}
