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
public class no5 {

    /**
     * @return 
     */
    
    public static int sawi(){
    int sawi = 1000;
    return sawi;
    }
    public static int kentang(){
    int kentang = 12000;
    return kentang;
    }
    public static int kubis(){
    int kubis = 5000;
    return kubis;
    }
    public static int wortel(){
    int wortel = 7000;
    return wortel;
    }
    public static int totalPendapatan(){
    int totalPendapatan = 1000+12000+5000+7000;
    return totalPendapatan;
    }
    public static void main(String[] args) {
        System.out.println("Penjualan Sayur : ");
    int sawi = sawi();
        System.out.println("1 ikat Sawi : "+ sawi);
    int kentang = kentang();
        System.out.println("1 kg Kentang : "+ kentang);
    int kubis = kubis();
        System.out.println("1/2 kg Kubis : "+ kubis);
    int wortel = wortel();
        System.out.println("1 kg Wortel : "+ wortel);
    int totalPendapatan = totalPendapatan();
        System.out.println("Total Pendapatan Hari Ini : "+ totalPendapatan);
    }
    }
    
    

