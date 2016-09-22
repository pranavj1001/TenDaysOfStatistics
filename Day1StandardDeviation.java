package com.TenDaysOfStatistics;

import java.util.*;

public class Day1StandardDeviation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        double mean = 0;
        double xMinusMean2 = 0;
        double standardDeviation;
        int[] data = new int[n]; 
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        
        for(int x : data){
            mean += x;
        }
        mean = mean/n;
        
        for(int x : data){
            xMinusMean2 += Math.pow((x - mean ),2);
        }
        
        standardDeviation = xMinusMean2/n;
        standardDeviation = Math.sqrt(standardDeviation);
        
        System.out.printf("%.1f\n", standardDeviation );
        sc.close();
        
    }
}
