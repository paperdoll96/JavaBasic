package construct;

/*
     this
 */
public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
        위 코드를 보면 메서드의 매개변수에 정의한 String name과 MemberInit의 멤버 변수 이름이
        String name 으로 둘다 똑같다! 나머지 변수 이름도 모두 같은걸 볼 수 있는데
        이때, 이름이 같으면 어떻게 구분이 가능할까?
        이런 경우 멤버변수보다 매개변수가 코드 블럭의 더 안쪽에 있어서 '매개변수가 우선순위'를 가진다!
        따라서 멤버 변수에 접근 하려면 앞에 this. 를 붙여주면 된다! 여기서 this는 인스턴스 자신의 참조값을 가리킨다!
     */
}
