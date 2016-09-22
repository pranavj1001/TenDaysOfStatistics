package com.TenDaysOfStatistics;

import java.util.*;

public class Day1InterquartileRange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] values = new int[n];
        int[] frequency = new int[n];
        int noOfValues = 0;
        for(int i = 0; i < n; i++){
            values[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            frequency[i] = sc.nextInt();
            noOfValues += frequency[i];
        }
        
        //System.out.println(noOfValues);
        
        int q1,q2,q3;
        int k = 0,l = 0;
        int[] lowerHalf;
        int[] upperHalf;
        int[] data = new int[noOfValues];
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < frequency[i]; j++){
                data[l] = values[i];
                l++;
            }
        }
        
        Arrays.sort(data);
        if(noOfValues%2 == 0){
            int i = noOfValues/2;
            q2 = data[i] + data[i-1];
            q2 = q2/2;
            lowerHalf = new int[i];
            upperHalf = new int[i];
            for(int j = 0; j < i; j++ ){
                lowerHalf[j] = data[j];
                //System.out.print(lowerHalf[j]+" ");
            }
            for(int j = i; j < noOfValues; j++ ){
                upperHalf[k] = data[j];
                //System.out.print(upperHalf[k]+" ");
                k++;
            }
        }else{
            int i = (noOfValues-1)/2;
            q2 = data[i];
            //System.out.println(i);
            lowerHalf = new int[i];
            upperHalf = new int[i];
            for(int j = 0; j < i; j++ ){
                lowerHalf[j] = data[j];
                //System.out.print(lowerHalf[j]+" ");
            }
            for(int j = i+1; j < noOfValues; j++ ){
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
        
        System.out.println((double)q3-q1);
        sc.close();
        
        
    }
}
