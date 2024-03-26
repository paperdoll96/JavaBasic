package class1;
/*
    클래스와 객체라는 개념이 왜 필요한지, 클래스가 어떤 방식으로 발전하면서
    만들어 졌는지 점진적으로 알아보자!
 */
public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age +
                        " 성적:" + student1Grade);

        System.out.println("이름:" + student2Name + " 나이:" + student2Age +
                        " 성적:" + student2Grade);
    }
    /*
        위 코드는 두 명의 학생 정보를 출력하는 프로그램이다.
        정보에는 이름, 나이, 성적이 있다.

       위 는 학생 2명을 다루어야 하기 때문에 각각 다른 변수를 사용했다.
       하지만 문제점으로 학생이 늘어날때마다 변수를 추가로 선언해야하고
       출력하는 코드도 추가해야하는 번거러움이 있다

       앞서 배운 배열을 사용하면 문제를 해결 할 수 있을까?
     */
}
