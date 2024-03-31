package final1;
/*
    final 변수와 상수(Constant)
    상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다!
    자바에서는 보통 단 하나만 존재하는! 변하지 않는 고정된 값을 상수라고 함!

    자바 상수 특징
    1. static final 키워드를 사용
    2. 대문자를 사용하고 구분은 _ (언더스코어)로 한다
    3. 필드를 직접 접근해서 사용한다
        - 상수 기능이 아니라 고정된 값 자체를 사용하는것이 목적! 상수는 값을 변경 할수 없어서
          필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않음!


 */
public class Constant {

    //수학 상수
    public static final double PI = 3.14;
    //시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    //애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;

    /*
        보통 위와 같은 상수들은 애플리케이션 전반에서 사용하기 때문에 public 을 자주 사용!
        그리고 중앙에서 값을 하나로 관리 할 수 있다는 장점!
        상수는 런타임에 변경할 수 없다! 변경하려면 프로그램 종료후, 코드를 변경하고 다시 실행!
     */
}
