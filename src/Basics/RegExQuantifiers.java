package Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExQuantifiers {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("[0-9]");
//        Pattern p = Pattern.compile("[a-zA-Z]");
//        Matcher m = p.matcher("abcd@147");
        Pattern p = Pattern.compile("a*");
        Matcher m = p.matcher("aaabaacd@147");
        while(m.find()){
            System.out.println(m.start()+"----------"+m.group());
        }

        String  str = "This is Mahadev";
        Pattern patStr = Pattern.compile(".*mahadev.*",Pattern.CASE_INSENSITIVE);
        Matcher mat = patStr.matcher(str);
        System.out.println(mat.matches());

    }
}
