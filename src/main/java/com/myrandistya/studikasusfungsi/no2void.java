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
public class no2void {

    /**
     * @param nama
     * @param umur
     * @param tempatLahir
     * @param tanggalLahir
     * @param jenisKelamin
     */
    public static void cetakBiodata (String nama, int umur, String tempatLahir, 
    String tanggalLahir, String jenisKelamin){
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Tempat Lahir : "+ tempatLahir);
        System.out.println("Tanggal Lahir : "+ tanggalLahir);
        System.out.println("Jenis Kelamin : "+ jenisKelamin);
    }
    public static void main(String[] args) {
    cetakBiodata("Randistya Fitria", 15, "Nganjuk", "16 November 2004", "Perempuan");
    }
    }
