package poly.ex1;

/*
    예제를 통한 다형성 이해하기!

 */
public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    /*
        단순히 동물들의 울음 소리를 출력하는 프로그램이다.
        만약 여기서 동물이 추가 된다면 ?
        돼지가 추가 되었다면 Pig 클래스를 만들고 코드도 추가 해야한다.
        그럼 중복된 코드도 많아지고 지저분해보인다!

        중복을 제거하기 위해서는 메서드를 사용하거나, 배열과 for문을 사용하면 되는데
        문제는 Dog Cat Caw 모드 다른 클래스라는것.

        타입이 다르기 때문에 불가능한 것인데, 반대로 얘기하면 Dog Cat Caw가 모드 같은 타입을 사용할 수 있는 방법이 있다면?

     */
}
