package oop1;

/*
    지금까지 개발한 음악 플레이어는 데이터와 기능이 분리되어 있었다!
    이제 데이터와 기능을 하나로 묶어서 음악 플레이어라는 개념을 온전히 하나의 클래스에 담아보자!
    음악 플레이어라는 객체를 지향해보자!

    음악 플레이어가 어떤 속성(데이터)를 가지고 어떤 기능(메서드)를 제공하는지 이 부분에 초점을 맞추어야 한다!
 */
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

    }
    /*
        MusicPlayer 클래스에 음악 플레이어에 필요한 속성과 기능을 모두 정의했다. 이제 음악 플레이어가 필요한 곳에서
        이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용할 수 있다. 음악 플레이어를 사용하는데 필요한 모든 속성과
        기능이 하나의 클래스에 포함되어 있다!
     */
}
