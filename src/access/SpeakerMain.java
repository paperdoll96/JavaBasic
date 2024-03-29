package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();
        /*
          실행결과는 음량이 100을 넘지 않는게 목표이므로 성공적이다.
          그런데, 시간이 흘러 새로운 개발자가 이 프로그램을 업그레이드 하려한다!
          요구사항을 모르던 새로운 개발자는 소리를 더 올리면 좋겠다 생각해, Speaker클래스를 보니 volume필드를 사용 할 수 있었다
        */

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근해서 수정");
    //    speaker.volume = 200;
        speaker.showVolume();

        // 코드를 실행한 순간 스피커에 과부하가 걸려서 고장났다!
    }

  // 이러한 문제를 근본적으로 해결하는 방법은 volume필드를 Speaker클래스 외부에서 접근하지 못하게 막는것!
    // 바로 볼륨앞에 private을 붙이기!


}
