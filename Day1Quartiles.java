package com.TenDaysOfStatistics;

import java.util.*;

public class Day1Quartiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        int q1,q2,q3;
        int k = 0;
        int[] lowerHalf;
        int[] upperHalf;
        n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        
        Arrays.sort(data);
        if(n%2 == 0){
            int i = n/2;
            q2 = data[i] + data[i-1];
            q2 = q2/2;
            lowerHalf = new int[i];
            upperHalf = new int[i];
            for(int j = 0; j < i; j++ ){
                lowerHalf[j] = data[j];
                //System.out.print(lowerHalf[j]+" ");
            }
            for(int j = i; j < n; j++ ){
                upperHalf[k] = data[j];
                //System.out.print(upperHalf[k]+" ");
                k++;
            }
        }else{
            int i = (n-1)/2;
            q2 = data[i];
            //System.out.println(i);
            lowerHalf = new int[i];
            upperHalf = new int[i];
            for(int j = 0; j < i; j++ ){
                lowerHalf[j] = data[j];
                //System.out.print(lowerHalf[j]+" ");
            }
            for(int j = i+1; j < n; j++ ){
                upperHalf[k] = data[j];
                //System.out.print(upperHalf[k]+" ");
                k++;
            }
        }
        
        if(lowerHalf.length%2 == 0){
            int i = lowerHalf.length/2;
            q1 = lowerHalf[i] + lowerHalf[i-1];
            q3 = upperHalf[i] + upperHalf[i-1];
            q1 = q1/2;
            q3 = q3/2;
        }else{
            int i = (lowerHalf.length-1)/2;
            q1 = lowerHalf[i];
            q3 = upperHalf[i];
        }
        
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        sc.close();
        
    }
}
