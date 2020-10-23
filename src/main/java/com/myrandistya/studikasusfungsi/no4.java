/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myrandistya.studikasusfungsi;

/**
 *
 * @author LENOVO
 */
public class no4 {

    /**
     * @return 
     */
    public static int UH1(){
    int UH1 = 85;
    return UH1;
    }
    public static int UH2(){
    int UH2 = 90;
    return UH2;
    }
    public static int UH3 (){
    int UH3 = 91;
    return UH3;
    }
    public static int UH4(){
    int UH4 = 98;
    return UH4;
    }
    public static int UH5(){
    int UH5 = 96;
    return UH5;
    }
    public static int totalUH(){
    int totalUH = 85+90+91+98+96;
    int rataRata = totalUH / 5;
    return rataRata;
    }
    
    public static void main(String[] args) {
    int UH1Rully = UH1();
        System.out.println("Ulangan Harian 1 : "+ UH1Rully);
    int UH2Rully = UH2();
        System.out.println("Ulangan Harian 2 : "+ UH2Rully);
    int UH3Rully = UH3();
        System.out.println("Ulangan Harian 3 : "+ UH3Rully);
    int UH4Rully = UH4();
        System.out.println("Ulangan Harian 4 : "+ UH4Rully);
    int UH5Rully = UH5();
        System.out.println("Ulangan Harian 5 : "+ UH5Rully);
    int rataRataRully = totalUH();
        System.out.println("Rata-rata nilai ulangan harian Rully : "+ rataRataRully);
    }
    
    }
