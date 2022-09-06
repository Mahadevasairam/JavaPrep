package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetHashset {
    public static void main(String[] args) {
        Set<String> value = new HashSet<String>();
        value.add("Mahadev");
        value.add("Nirnay");
        value.add("Patel");
        value.add("kapil");
        System.out.println(value);
        value.remove("kapil");
        System.out.println(value);
        for (String s : value) {
            System.out.println(s);
        }


        Set<Integer> val1 = new HashSet<>();
        val1.addAll(Arrays.asList(1,2,3,7,6,2));
        System.out.println(val1);

        Set<Integer> val2 = new HashSet<>();
        val2.addAll(Arrays.asList(1,2,7,11,12,13));
        System.out.println(val2);

        Set<Integer> inter = new HashSet<>(val1);
        inter.retainAll(val2);
        System.out.println(inter);

        Set<Integer> union = new HashSet<>(val1);
        union.addAll(val2);
        System.out.println(union);

        Set<Integer> diff = new HashSet<>(val1);
        diff.removeAll(val2);
        System.out.println(diff);
    }
}
