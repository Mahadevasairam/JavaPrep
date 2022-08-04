package com.Mahadev;

public class CanProblem {
    public static void main(String[] args) {
        boolean result = canPack (1, 0, 4);
        System.out.println(result);
        result = canPack (1, 0, 5);
        System.out.println(result);
        result = canPack (0, 5, 4);
        System.out.println(result);
        result = canPack (2, 2, 11);
        System.out.println(result);
        result = canPack (-3, 2, 12);
        System.out.println(result);
    }

    public static boolean canPack(int bigCount,int smallCount,int goal){
       boolean result = false;
       bigCount = 5*bigCount;
       int goal1 = bigCount+smallCount;
        if(bigCount<0 || smallCount<0 || goal<0)
            return false;
        else{
            if(goal1 >= goal)
                result = true;

        }
    return result;
    }
}
