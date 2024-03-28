package oop1;

public class MusicPlayerMain4  {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }

    /*
        MusicPlayer 객체를 생성하고 필요한 기능(메서드)을 호출하고 있다!
        MusicPlayer를 사용하는 입장에서는 내부에 어떤 속성(대이터가)이 있는지 전혀 몰라도 된다!
        단순히 MusicPlayer가 제공하는 기능 중에 필요한 기능만 호출해서 사용하면 된다!
        이 덕분에 코드 읽기 쉬운건 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 쉬워진다.
        MusicPlayer의 volume이라는 필드 이름이 다른 이름으로 변한다고 할때 내부만 변경하면 끝!
        MusicPlayer를 사용하려는 개발자는 코드를 전혀 변경하지 않아도 된다!
        하지만 외부에서 호출하는 MusicPlayer의 메서드르 이름을 변경하면 사용하는곳도 변경해줘야 함!
     */

    /*  캡슐화
        MusicPlayer 를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여있는 것 같다. 이렇게
        속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다!
     */
}
