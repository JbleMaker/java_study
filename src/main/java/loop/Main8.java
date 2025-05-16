package loop;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        // newWords에 1. bread, 2. milk, 3. egg 처럼 앞에 숫자를 붙여서 옮기시오.
        List<String> words = List.of("bread", "milk", "egg");
        List<String> newWords = new ArrayList<>();
        List<String> newWords2 = new ArrayList<>();


        for(String word : words){
            int i = 1;
            StringBuffer buf = new StringBuffer(word);
            buf.insert(0, (i + ". "));
            newWords.add(String.valueOf(buf));
            i++;
        }
        System.out.println(newWords);

        for(int i = 0; i < words.size(); i++){
            newWords2.add((i+1) + ". " + words.get(i));
        }
        System.out.println(newWords2);


        // Boxing, unBoxing
        int a = 10;
        Integer b = (Integer) a;    // boxing
        int c = (int) b;            // 래퍼 클래스를 일반클래스로 언박싱(오픈 박싱)
        System.out.println(a+b);


        // ints 리스트에 Integer 자료형으로 옮기시오.
        List<Double> doubles = List.of(1.12, 2.23, 3.34, 4.45);
        List<Integer> ints = new ArrayList<>();

        for(Double d : doubles){
//            double dd = d;
//            int i = (int) dd;
//            ints.add(i);
//            ints.add((int) Math.round(d));
            ints.add(d.intValue());
        }
        System.out.println(doubles);
        System.out.println(ints);


    }
}
