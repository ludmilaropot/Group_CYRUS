package Ephrem;

import java.util.ArrayList;

public class consecutiveNumber {
    public static ArrayList<String> consec(int numb){
        ArrayList <String> number = new ArrayList<>();
        for(int i =1; i<numb+1;i++) {
            if (i % 2 == 0 && i%3 ==0 && i%5==0) {
                number.add("CodilityTestCoders");
            }else if (i % 2 == 0 && i % 3 == 0){
                number.add("CodilityTest");
            }else if(i % 2 == 0 &&i%5==0){
                number.add("CodilityCoders");
            }else if(i % 3 == 0 && i % 5 == 0){
                number.add("TestCoders");
            }else if (i % 2 == 0){
                number.add("Codility");
            }else if (i % 3 == 0){
                number.add("Test");
            }else if (i % 5 == 0){
                number.add("Coders");
            }else {
                number.add("" + i);
            }
        }
        return number;
    }
    public static void main(String[] args) {

        System.out.println(consec(76));
    }
}
