package poly.car1;

public class GV80Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("GV80엔진이 켜집니다");

    }

    @Override
    public void offEngine() {
        System.out.println("GV80엔진이 꺼집니다");

    }

    @Override
    public void pressAccel() {
        System.out.println("GV80악셀을 밟습니다");

    }
}
