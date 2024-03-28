package oop1.ex;

/*
    직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램
 */
public class RectangleOopMain {
    public static void main(String[] args) {

        Rectangle result = new Rectangle();
        result.width = 5;
        result.height = 8;

        int area = result.calculateArea();
        System.out.println("넓이 : " + area);

        int perimeter = result.calculatePerimeter();
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = result.isSquare();
        System.out.println("정사각형 여부 : " + square);

    }
}
