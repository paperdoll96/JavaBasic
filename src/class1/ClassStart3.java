package class1;

/*
    여기서는 앞서 만든 학생 클래스를 사용하는 코드를 작성한다!
 */
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 수 있는 변수 선언
        student1 = new Student(); // 객체를 생성하기 위해 'new 클래스명()'을 사용 그리고 생성한 객체를 참조하기 위해 stundent1에 대입
        student1.name = "학생1"; // 객체가 가지고 있는 멤버변수에 값을 대입하려면 .(점) 으로 객체에 접근 가능!
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성 적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성 적:" + student2.grade);
    }

    /*
        타입은 데이터의 종류나 형태를 나타낸다. int라고하면 정수, String이라고하면 문자 타입이다
        클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있다!
        사용자가 직접 정의하는 사용자 정의 타입을 만들기 위해 설계도가 필요한데 바로 이 설계도가 클래스!
        설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다!
     */
}
