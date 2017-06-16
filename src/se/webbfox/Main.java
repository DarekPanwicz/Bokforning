package se.webbfox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program
//        ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
//        należny podatek. Podatek obliczany jest wg. następujących reguł:
//        • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//        • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
//
        double podatek;
        double zmiennaMinus= -556.02;
        double zmienna1= 85.528;
        System.out.println("Podaj informacje o swoim podatku ");


        Scanner in= new Scanner(System.in);
        double dochod=in.nextInt();

        if (zmienna1 <= dochod){

            double cena1= 18% + zmiennaMinus;
            double final1= dochod+cena1;

            System.out.println("Wartosc podatku to "+ final1);



        }













    }
}
