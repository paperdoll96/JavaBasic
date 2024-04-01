package extends1.super2;

public class ClassB  extends  ClassA{

    public ClassB(int a) {
        super();
        // 상속관계에서 부모 생성자 호출 할떄 위처럼 super() 사용
        // 만약에 부모 생성자에 파라미터가 없는 경우는 super() 생략해도 알아서 만들어줌!
        System.out.println("ClassB 생성자 a = " + a);
    }
}
