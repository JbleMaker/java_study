package generic;
/*
    hsRepo는 List<>
    hs는 오브젝트 -> 때문에 다운캐스팅을 해야지만 메서드 사용가능
    제네릭을 사용하지 않을 경우 다운캐스팅을 사용해야되지만
    제네릭을 사용하게 되는 경우 다운캐스팅을 하지 않아도 된다.

    와일드칻(?)의 제약조건
    1. ? extends 클래스자료형 -> 해당 클래스 자료형의 자식 클래스자료형만 허용
    2. ? super 클래스자료형   -> 해당 클래스 자료형의 부모 클래스자료형만 허용
 */
public class Main {

    public static void showAll(Repository<? extends Student> repository){
        repository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Repository<HighStudent> hsRepo = new Repository<>();
        Repository<AcademyStudent> asRepo = new Repository<>();

        hsRepo.save(new HighStudent());
        asRepo.save(new AcademyStudent());

        hsRepo.findAll().forEach(hs -> hs.toString());
        asRepo.findAll().forEach(as -> as.getName());

        showAll(hsRepo);
        showAll(asRepo);
    }
}
