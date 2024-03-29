package construct;

public class MemberDefaultMain {
    public static void main(String[] args) {

        MemberDefault memberDefault = new MemberDefault();

    }

    /*
         그렇다면 왜? 기본생성자를 자동으로 만들어줄까?
         자바에서 기본 생성자를 만들어주지 않는다면 생성자 기능이 필요하지 않은 경우에도 모든 클래스에 개발자가
         직접 기본생성자를 정의 해야한다 ! 생성자 기능을 사용하지 않는 경우도 있어서 이런 편의 기능을 제공!

         - 생성자는 반드시 호출되어야 한다!
         - 생성자가 없으면 기본 생성자가 제공!
         - 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다. 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다!
     */
}
