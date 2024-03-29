package construct;


/*
    생성자 - 오버로딩과 this()
    생성자도 메서드 오버로딩처럼 매개변수만 다르게 해서 여러 생성자를 제공 할 수 있음!
 */
public class MemberConstruct2 {
    String name;
    int age;
    int grade;

    // 생성자 하나 더 추가
    MemberConstruct2(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }

    MemberConstruct2(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;


    }

    /*
        여기서 두 생성자를 비교해 보면 코드가 중복되는 부분이 보인다!
        this.name 과 this.age
        이떄 this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출 할 수 있다!
        ex ) this(name, age, 50);

        this() 규칙으로 생성자 코드의 첫줄에만 작성 가능!!!!!!!!!!
     */
}
