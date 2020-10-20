/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] Data = new String[6];
        int x =1;
        System.out.println("input sebanyak :" + x);
        System.out.println("------------\n <<Data Siswa>>");
        for (int i = 0; i < x; i++) {
            System.out.println("Masukan Data");
            System.out.print("Nama:");
            Data[0] = input.nextLine();
            System.out.print("Alamat:");
            Data[1] = input.nextLine();
            System.out.print("Tempat, Tanggal Lahir:");
            Data[2] = input.nextLine();
            System.out.print("NISN:");
            Data[3] = input.nextLine();
            System.out.print("No Induk:");
            Data[4] = input.nextLine();
            System.out.print("Jenis kelamin:");
            Data[5] = input.nextLine();
        }
        for (int i = 0; i < x; i++) {
            System.out.println("\nData ke " + i + " Berhasil di input");
            System.out.println("Nama\t\t\t: " + Data[0]);
            System.out.println("Alamat\t\t\t: " + Data[1]);
            System.out.println("Tempat, Tanggal Lahir\t: " + Data[2]);
            System.out.println("NISN\t\t\t: " + Data[3]);
            System.out.println("No Induk\t\t: " + Data[4]);
            System.out.println("Jenis kelamin\t\t: " + Data[5]);
        }
    }
}
