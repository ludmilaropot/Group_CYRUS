package Ephrem;

import java.util.ArrayList;

public class finRa {

        public static void main(String[] args) {
            System.out.println(finRa());
        }

        public static ArrayList<String> finRa(){
            ArrayList <String> div1 = new ArrayList<>();
            for (int i=1; i<31;i++){
                if(i%3==0 && i%5==0){
                    div1.add("FINRA");
                }else if(i%3==0){
                    div1.add("FIN");
                }else if(i%5==0){
                    div1.add("RA");
                }else{
                    div1.add(""+i);
                }
            }
            return div1;
        }
}
