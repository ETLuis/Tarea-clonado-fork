package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int base=0;
        int altura=0;
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: "+base);
        base = sc.nextInt();
        System.out.println("Introduce la base: "+altura);
        altura = sc.nextInt();


        area=base*altura/2;
        System.out.println("Resultado area: "+area);
    }
}
