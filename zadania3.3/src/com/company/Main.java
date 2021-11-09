package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Scanner obiekt = new Scanner(System.in);
        Random rand = new Random();

        int m= obiekt.nextInt();
        int n= obiekt.nextInt();
        int k= obiekt.nextInt();

        while(m<=1 && m>=10 && n<=1 && n>=10 && k<=1 && k>=10) {
            m = obiekt.nextInt();
            n = obiekt.nextInt();
            k = obiekt.nextInt();
        }

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[j][i] = rand.nextInt(5);
            }
        }
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                b[j][i] = rand.nextInt(5);
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(" ");
            for(int j=0; j<m; j++){
                System.out.print(a[j][i]+" ");
            }
        }
        System.out.println(" ");

        for(int i=0; i<k; i++){
            System.out.println(" ");
            for(int j=0; j<n; j++){
                System.out.print(b[j][i]+" ");
            }
        }
        System.out.println(" ");



        int[][] c = new int[m][k];
        int iloczyn=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                for(int l=0;l<n;l++){
                    iloczyn+= a[i][l]*b[l][j];
                }
                c[i][j]=iloczyn;
                iloczyn=0;
            }
        }

        for(int i=0; i<k; i++){
            System.out.println(" ");
            for(int j=0; j<m; j++){
                System.out.print(c[j][i]+" ");
            }
        }
        System.out.println(" ");
    }
}
