import java.util.*;


public class Solution {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {

        int max;
        long count=0,countTemp=0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            int temp = a.get(i);
            System.out.println("temp= "+temp);
            if(temp>=0){
                countTemp = countTemp + temp;
                t.add(temp);
            }
            else{
                System.out.println("in else"+t);
                System.out.println("count= "+count+" countTemp="+countTemp);
                if(count<countTemp){
                    System.out.println("entered second if");
                    count = countTemp;
                    result =t;
                }
                else if(count==countTemp && t.size()>result.size()){
                    count =countTemp;
                    result =t;
                }
                System.out.println("result"+ result);
                t=new ArrayList<>();
                countTemp=0;
            }
        }

        if(countTemp>count){
            result=t;
        }

        System.out.println("\n");
        System.out.println("Result "+result);
        System.out.println("count= "+count);
        System.out.println("temp"+t);
        System.out.println("countTemp"+countTemp);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        in.add(1967513926);
        in.add(1540383426);
        in.add(-1303455736);
        in.add(-521595368);
        // System.out.println(maxset(in));

        ArrayList <Integer> in1 = new ArrayList<>();

        in1.add(756898537);
        in1.add(-1973594324);
        in1.add(-2038664370);
        in1.add(-184803526);
        in1.add(1424268980);
        System.out.println(maxset(in1));

    }
}