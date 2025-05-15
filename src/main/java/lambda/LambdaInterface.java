package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Runnable");
        }; // 메인문 처럼 사용가능.
        runnable.run();

        Supplier<Double> supplier = () -> 10.101;
        double d = supplier.get();

        Consumer<Integer> consumer = n -> {
            // List<>
            System.out.println("Consumer : " + n);
        };
        consumer.accept(1000);

        List<Integer> numList = List.of(1,2,3,4,5);
        numList.forEach(n -> System.out.println("Number : " + n));

        Function<String, String> fx = name -> "name: " + name;
        String nameText = fx.apply("KIMJONGBO");

        UnaryOperator<String> fx1 = name -> "이름 : " + name;
        String nameText2 = fx1.apply("김종보");

        String serachName = "일";
        List<String> classOne = List.of("일", "이", "삼");
        List<String> classTwo = List.of("사", "오", "육");

        Predicate<List<String>> isContains = list -> list.contains(serachName);
        // 참 거짓 판단 => boolean 반환

        Predicate<String> isContains2 = name -> classOne.contains(name) || classTwo.contains(name);

        List<String> spelling = List.of("aaaa", "baaa", "cccc", "ddda", "efff", "faas");
        List<String> aList= new ArrayList<>();
        // 알파벳 a만 포함된 문자열들을 새로운 리스트에 담기.
//        for (int i = 0; i < spelling.size(); i++){
//            if(spelling.get(i).contains("a")){
//                aList.add(spelling.get(i));
//            }
//        }
        
        for(String data : spelling){
            if(data.contains("a")) aList.add(data);
        }
        System.out.println(aList);

        List<String> aList2 = spelling.stream()
                .filter(data -> data.contains("a"))
                .toList();
        System.out.println(aList2);


//        Stream<Integer> numStream = List.of(1,2,3,4,5,6,7,8,9,10).stream();
        /*
            스트림 구성
            1. 스트림 생성 단계
            2. 중간 연산 단계(조건에 맞는 데이터 구분(filter), 데이터 값 수정, 정렬(sort), 중복제거, 제한, 건너뛰기)
            -> 다시 스트림을 리턴해주면 중간단계
            3. 최종 연산 단계(반복, 결과 수집, 개수조회, 매칭여부, 검색, 합산)
            스트림 특징 -> 반복 중 뒤로 돌아갈 수는 없다.
            스트림은 소비되는 공간. List.of와 달리 유지되지 않음.
         */
        Stream<Integer> numStream = Stream.of(1,2,3,4); // 생성단계
        numStream.filter(num -> num % 4 == 0).forEach(n -> System.out.println(n));

        List<Integer> numList2 = List.of(1,2,3,4);
        for(Integer num : numList2){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
