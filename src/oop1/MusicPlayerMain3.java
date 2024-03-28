package oop1;
/*
    코드를 보면 각각의 기능들이 중복된 부분들이 있다
    그리고 이 기능들은 이후에 재사용 될 가능성이 높다!
    메서드를 사용해 각각의 기능을 구분해보자!
 */
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume); } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    /*
        각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화 되어 장점이 생겼다
        1. 중복 제거 : 로직 중복이 제거 됨. 필요하면 해당 메서드를 여러번 호출!
        2. 변경 영향 범위 : 기능을 수정할 때 해당 메서드 내부만 변경하면 됨!
        3. 메서드 이름 추가 : 메서드 이름을 통해 코드를 쉽게 이해!
     */

    /* 절차 지향 프로그래밍의 한계
        우리는 클래스와 메서드를 이용하여 데이터와 기능을 묶고 모듈화함으로써 코드의 가독성과 유지보수성을 향상시켰다.
        그러나 이러한 절차 지향적 접근 방식에는 데이터와 기능이 별개로 존재한다는 한계가 있다. 예를 들어, 음악 플레이어의 데이터는 한 클래스에, 해당 데이터를 조작하는 기능들은 다른 클래스에 흩어져 있다.
        그 말은 유지보수 관점에서도 관리 포인트가 2곳으로 늘어난다는 소리!
        객체 지향 프로그래밍은 이런 한계를 넘어서 데이터와 기능을 하나의 단위로 결합함으로써 유지보수를 더욱 쉽게 만들고 관리 포인트를 단일화한다!
     */
}
