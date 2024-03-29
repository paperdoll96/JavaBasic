package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // 생성자를 오버로딩 한 덕분에 성적 입력이 꼭 필요한 경우는 grade가 있는 생성자를 호출하면 되고.
        // 그렇지 않은 경우는 grade가 없는 생성자를 호출하면 된다!
        MemberConstruct2 member1 = new MemberConstruct2("user1", 15, 90);
        MemberConstruct2 member2 = new MemberConstruct2("user2", 16);

        MemberConstruct2[] members = {member1, member2};

        for (MemberConstruct2 s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }

}
