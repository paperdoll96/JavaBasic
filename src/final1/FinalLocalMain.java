package final1;

/*
    final 키워드는 이름 그대로 끝!
    변수에 final 키워드가 붙으면 더는 값을 변경 불가!

 */
public class FinalLocalMain {
    public static void main(String[] args) {

        //final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        //data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10);
    }

    //final 매개변수
    static void method(final int parameter) {
        //parameter = 20; 컴파일 오류 }
        // 매개변수에 final이 붙으면 메서드 내부에서 매겨변수의 값을 변경 할 수 없음!
        // 따라서 메서드 호출 시점에 사용 된 값이 끝까지 사용
    }
}
