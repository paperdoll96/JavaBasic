package poly.car1;

public class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("K3엔진이 켜집니다");
    }

    @Override
    public void offEngine() {
        System.out.println("K3엔진이 꺼집니다");
    }

    @Override
    public void pressAccel() {
        System.out.println("K3악셀을 밟습니다/");
    }
}
