package com.TenDaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day0MeanMedianMode {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double mean = 0, median = 0;
        int mode;
        int n;
        int maxValue = 0;
        int maxValues = 0;
        n = sc.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++ ){
            array[i] = sc.nextInt();
        }
        
        //Sorting for Mode and Median
        Arrays.sort(array);
        
        //Mean
        for(int x : array){
            mean += x;
        }
        mean = mean/n;
        System.out.println(mean);
        
        //Median
        if(n%2 == 0){
            int i = n/2;
            median = array[i] + array[i-1];
            median = median/2;
        }else{
            int i = (n-1)/2;
            median = array[i];
        }
        System.out.println(median);
        
        //Mode
        for (int i = 0; i < n; i++) {
            int x = array[i];
            int xCounter = 0;
            for (int j = 0; j < n; j++) {
                if (x == array[j]) {
                    xCounter++;
                }
            }
            if (maxValues < xCounter) {
                maxValues = xCounter;
                maxValue = x;
            }
        }
        mode = maxValue;
        System.out.println(mode);
        
        sc.close();
    }
}
