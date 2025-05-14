package lambda;

public class Main {
    public static void main(String[] args) {
        아무거나가능한인터페이스 a = new 식사();
        아무거나가능한인터페이스 b = new 운동();

        a.실행();
        b.실행();
        
        아무거나가능한인터페이스 c = new 아무거나가능한인터페이스(){
            // 익명클래스
            @Override
            public void 실행(){
                System.out.println("태어났다");
            };
        };
        c.실행();

        // 람다식을 정의할 때 꼭 지켜야하는 조건 ->
        // 단 하나의 추상메소드만 정의해야 된다.

        아무거나가능한인터페이스 d = () -> System.out.println("태어나다");
        d.실행();

        아무거나가능한인터페이스2 e = (String data1, String data2) -> {
            return data1 + data2;
        };
        String e결과 = e.실행("data1", "data3");
        System.out.println(e결과);

        // 매개변수의 자료형을 생략할 수 있고, 변수명 변경가능.
        아무거나가능한인터페이스2 f = (d1,d2) -> {
            return d1 + d2;
        };

        // 재정의 함수 내용이 한줄의 명령이면 {} 생략 가능.
        // 단, 리턴이 있는 경우 리턴 값만 한줄로 작성해야 한다.
        아무거나가능한인터페이스 g = () -> System.out.println("한줄 명령 실행.");
        아무거나가능한인터페이스2 g2 = (d1,d2) -> d1 + d2;

        // 매개변수가 하나면 매개변수를 감싸는 ()를 생략할 수 있다.
        아무거나가능한인터페이스3 h = d3 -> "Data " + d3;
        String h결과 = h.실행("아무거나");
    }
}
