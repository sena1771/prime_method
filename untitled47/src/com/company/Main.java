package com.company;

import java.util.Scanner;

public class Main {
    static boolean prime(int a,int i){
     while(a!=i) {
         if (a <= 2) {
             return (a == 2) ? true : false;
         } else if (a % i == 0) {
             return false;

         }

         if
             (i == a / 2 + 1) {
             return true;
         }
         i++;
     }

        return prime(a,i+1);

    }




    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");
        int a= inp.nextInt();
          if(prime(a, 2)==false){
          System.out.print(a+" is NOT a prime number. "); }
          else{
              System.out.print(a+" is a prime number. ");
          }

      }











    }


