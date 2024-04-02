package poly.ex2;
/*
    배열과 for문을 이용해서 중복 제거하기
 */
public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()}; // 다형적 참조 덕분에 Dog Cat Caw의 부모타입인 Animal타입으로 배열을 만들고, 각각을 배열에 포함
        // 참고로 위에서 ctrl + alt + n 누르면 자동으로 바꿔줌 ㄷㄷ


        for (Animal animal : animalArr) { // 향상된 for문으로 배열 반복
            animalSound(animal);
        }

    }

    // 동물이 추가 되어도 변하지 않는 코드
    private static void animalSound(Animal animal) {
        System.out.println("동물소리테스트 시작");
        animal.sound();
        System.out.println("동물소리테스트 종료");
        /* 메서드 추출하는 단축키 ctrl + alt + m */
    }


    /*
        위처럼 새로운 기능이 추가되었을때 변하는 부분을 최소화 하는 것이 잘 작성된 코드!
        그래서 변하는 부분과 변하지 않는 부분을 명확하게 구분하는것이 중요!
     */

    /*
        사실 위에서는 2가지 문제가 있는데,
        첫번째로 Animal클래스를 생성할 수 있는 문제.
        이게 무슨 말이냐 하면, 사실 동물이라는 것은 실제하지 않은, 즉 추상적인 개념인데
        이 클래스는 다형성을 위해 필요한 것이지 직접 인스턴스를 생성해서 사용할 일이 없다

        두번째로는 상속받은 곳에서 메서드 오버라이딩 하지 않을 가능성.
        예를 들어 Animal을 상속받은 Bird 클래스를 만들었다. 그런데 다른 개발자가 실수로
        sound() 메서드를 오버라이딩 하지 않으면 부모의 기능을 상속받는다.
        코드상 아무런 문제는 없지만 기대와 다르게 짹짹이 아니라 Animal에 있는 sound()가 호출됨

        문제를 해결해보기위해 추상클래스와 추상메서드를 알아보자!
     */
}
