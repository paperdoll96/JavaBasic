package access;

/*
    접근 제어자의 이해
    자바는 public, private 같은 접근 제어자를 제공한다,
    접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한 할 수 있다!
    왜 이런 접근제어자가 필요한지 알아보자
 */
public class Speaker {
    private int volume; // private 접근 제어자는 모든 외부 호출을 막는다. 따라서 private 이 붙은 경우 해당 클래스 내부에서만 호출할 수 있다

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume() {
        System.out.println("현재 음량:" + volume);
    }
}
