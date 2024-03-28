package oop1;

/*
    절자 치향 프로그래밍
    지금까지 클래스와 객체를 사용해서 관련 데이터를 묶어서 사용하는 방법을 학습했다.
    그럼 앞서 배운 것 처럼 단순히 객체를 사용하기만 하면 객체 지향 프로그래밍이라 할 수 있을까?
    사실 지금까지 우리가 작성한 모든 프로그램은 절차 지향 프로그램이다.

    절자 치향에서 객체 지향으로 점진적으로 코드를 변경하며 객체 지향 프로그래밍을 이해해보자!
 */
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //볼륨 증가 volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    /*
    순서대로 프로그램이 작동하도록 단순하게 작성했다. 이 코드를 점진적으로 변경해보자!
     */
}
