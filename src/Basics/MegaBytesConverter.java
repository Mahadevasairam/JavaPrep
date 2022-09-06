package Basics;

import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        System.out.println("Enter KiloBytes: ");
        Scanner sc = new Scanner(System.in);
        int kiloBytes = sc.nextInt();
        printMegaBytes(kiloBytes);
    }
    public static void printMegaBytes(int kilobytes){
        int megaBytes = kilobytes * 1024;
        System.out.println("kilobytes to MegaBytes:"+megaBytes);
    }

}
