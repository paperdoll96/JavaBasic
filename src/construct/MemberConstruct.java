package construct;

/*
    생성자 도입
    대부분의 객체 지향언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록
    '생성자'라는 기능을 제공한다! 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행 가능!

 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
        /*
            바로 이게 생성자인데 생성자는 메서드와 비슷하지만 몇가지 차이점이 있다
            1. 생성자 이름은 클래스 이름과 같아야한다 따라서 첫글자도 대문자!
            2. 생성자는 반환타입이 없다!
            3. 나머지는 메서드와 같다!
         */

    }
}
