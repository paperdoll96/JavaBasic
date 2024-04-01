package poly.basic;

/*
    다형성
    객체지향의 대표적인 특징으로는 캡슐화, 상속, 다형성이 있다!
    다형성은 제대로 이해하기 어렵고 활용하기는 더 어렵다! 그러니 잘 공부해보자!
 */
public class PolyMain {
    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();
    }
}
