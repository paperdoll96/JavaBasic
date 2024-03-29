package construct;

/*
    기본 생성자
    매개변수가 없는 생성자를 기본 생성자라고 한다!
    클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만듬!
    생성자가 하나라도 있으면 자바는 기본생성자를 만들지 않는다!
 */
public class MemberDefault {
    String name;

    MemberDefault() {
        // 이게 바로 기본 생성자!
    }

}
