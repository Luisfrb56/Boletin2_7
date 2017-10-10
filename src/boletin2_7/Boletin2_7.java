
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {


    public static void main(String[] args) {
        float k=273.15F;
        Scanner sc= new Scanner(System.in);
        float gradosºC, kelvin,fahrenheit;
        System.out.println("Teclea la temperatura en grados :");
        gradosºC=sc.nextFloat();
        kelvin=k+gradosºC;
        fahrenheit=(float) (32+1.8*gradosºC);
        System.out.println(gradosºC+"ºC son "+kelvin+ " Kelvin y "+fahrenheit+ "Fahrenheit");
        

    }
    
}
