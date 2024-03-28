package oop1.ex;

/*
    직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램
 */
public class Rectangle {

    int width;
    int height;

    int calculateArea() {

        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
