package com.company;

import java.util.*;
import java.io.*;

class Main {

    public static boolean Usernamevalidation(String str) {
        char[] s = str.toCharArray();
        int n = str.length();
        if((str.length()>=4 && str.length()<=25) && (Character.isLetter(s[0]) &&  s[n-1]!= '_')){
            for (int i=1 ; i < str.length(); i++){
                if ( Character.isLetter(s[i]) || Character.isDigit(s[i]) || s[i] == '_' ){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        boolean a = Usernamevalidation(s.nextLine());
        System.out.print(a);
    }

}