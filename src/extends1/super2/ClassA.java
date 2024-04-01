package extends1.super2;

/*
    super - 생성자
    상속관계의 인스턴스를 생성하면 결국 메모리 내부에는 자식과 부모 클래스가 각각 다 만들어짐!
    따라서 각각의 생성자도 호출 되어야 한다!
 */
public class ClassA {

    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
