package collection.framework;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(13);
        num.add(45);
        num.add(90);
//        for(int i=0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }
//        for(Integer number : num){
//            System.out.println(number);
//        }
        Iterator<Integer> itr = num.iterator();
        while(itr.hasNext()){
            int number = itr.next();
//            System.out.println(number);
            if(number==90){
                itr.remove();
                continue;
            }
            System.out.println(number);

        }
    }
}
