package class1.ex;

/*
    MovieReviewMain 클래스 안에 main() 메서드를 포함하여 영화 리뷰 정보를 선언하고 출력하기!
 */
public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview avengers = new MovieReview();
        avengers.title = "어벤져스";
        avengers.review = "지구를 지켜라";

        MovieReview coco = new MovieReview();
        coco.title = "코코";
        coco.review = "인생 영화!";

        System.out.println("영화 제목 : " + avengers.title+ ", " + "리뷰 : " + avengers.review);
        System.out.println("영화 제목 : " + coco.title+ ", " + "리뷰 : " + coco.review);


    }
}
