package poly.ex2;

/*
    ex1에서 했던 내용을 다형성을 사용하여 변경하였다
    다형성을 사용하기 위해 여기서는 상속관계를 사용했는데, Animal이라는 부모클래스를 만들고 sound() 메서드를 정의 했따
    Dog Cat Caw는 Animal 클래스를 상속받고 부모의 sound()를 오버라이딩 했다
 */
public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);

        soundAnimal(cat);

        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물소리테스트 시작");
        animal.sound();
        System.out.println("동물소리테스트 종료");
    }
    /*
        이 코드의 핵심은 Animal animal
        1.다형적 참조 덕분에 animal 변수는 자식은 Dog, Cat, Cow의 인스턴스를 참조 할 수 있다
        2. 메서드 오버라이딩 덕분에 animal.sound() 를 호출해도 오버라이딩한 각각의 자식클래스의 메서드들이 호출된다!

        이런 다형성 덕분에 새로운 동물을 추가해서 위 soundAnimal() 코드를 그대로 재사용 할 수 있다!
     */
}
