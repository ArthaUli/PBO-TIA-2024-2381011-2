package latihansoal;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int[] Bilangan = new int[2];
        Scanner Input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Pertama : ");
        Bilangan[0] = Input.nextInt();

        System.out.println("Masukkan Bilangan Kedua : ");
        Bilangan[1] = Input.nextInt();

        if(Bilangan[1] > Bilangan[0]){
            System.out.println(Bilangan[1]);
        }else{
            System.out.println(Bilangan[0]);
        }

    }
}
