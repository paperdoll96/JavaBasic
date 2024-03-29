package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        // 이렇게 하면 인스턴스를 생성하고 즉시 해당 생성자를 호출한다.
        // 여기서는 Member 인스턴스를 생성하고 바로 MemberConstruct(String name, int age, int grade) 생성자를 호출한다.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }

    /*
        참고로 new 키워드를 사용해서 객체를 생성할때 마지막에 괄호() 도 포함해야 하는 이유가 바로 생성자 때문!
        객체를 생성하면서 동시에 생성자를 호출한다는 의미!
     */

    /*
        생성자의 장점으로 생성 직후에 어떤 작업을 수행하기위해 메서드를 한번 더 호출해야 했지만
        생성자 덕분에 객체를 생성하면서 동시에 직후 필요한 작업을 한번에 처리 할 수 있어서 중복호출제거에 좋고

        생성자를 사용하면 필수값 입력을 보장할 수 있다!
        만약 직접 정의한 생성자를 호출하지 않으면 컴파일 오류가 발생! 'no suitable constructor found for MemberConstruct(no arguments)'
     */
}
