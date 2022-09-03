/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cryptionsoftware;


import java.util.Scanner;
public class Sample
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
         
        s1 = rearrange(s1);
        s2 = rearrange(s2);
        s3 = rearrange(s3);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        
    }
    
    
    public static void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    
    public static String rearrange(String s)
    {
        int[] arr = new int[s.length()];
        
        char[] str = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++)
        {
            int temp = s.charAt(i);
            
            if(temp < 91 && temp > 64)
            {
                temp = temp + 32;
            }
            arr[i] = temp;
        }
        bubbleSort(arr);
        
        for(int i = 0; i < arr.length; i++)
        {
            str[i] = (char)arr[i];
        }
        s = new String(str);
        return s;

    }
}





