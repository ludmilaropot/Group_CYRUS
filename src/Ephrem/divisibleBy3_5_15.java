package Ephrem;

import java.util.ArrayList;

public class divisibleBy3_5_15 {
    public static String  divisible(){
        ArrayList<Integer>numb1UpTo100 = new ArrayList<>();
        ArrayList<Integer>divisibleBy3 = new ArrayList<>();
        ArrayList<Integer>divisibleBy5 = new ArrayList<>();
        ArrayList<Integer>divisibleBy15 = new ArrayList<>();

        //ArrayList<Integer>numb1UpTo100 = new ArrayList<>();
        for (int i = 1; i<101; i++){
            numb1UpTo100.add(i);
        }
        for(Object numb: numb1UpTo100){
            if ((Integer)numb%3 == 0){
                divisibleBy3.add((Integer) numb);
            }if ((Integer)numb%5 == 0){
                divisibleBy5.add((Integer)numb);
            }if ((Integer)numb%15 == 0){
                divisibleBy15.add((Integer)numb);
            }
        }
        String result ="Divisible by 3: "+divisibleBy3+ "\nDivisible by 5: "+divisibleBy5+
                            "\nDivisible by 15: "+divisibleBy15;

        return result;
    }



    public static void main(String[] args) {
        System.out.println(divisible());
    }
}
