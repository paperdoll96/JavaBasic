package class1.ex;
/*
    기존 Main문제에서 배열을 도입하고 영화 리뷰를 배열에 관리!
    리뷰를 출력할때 배열과for문을 사용해서 sout을 한번만 사용하자!
 */
public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview avengers = new MovieReview();
        avengers.title = "어벤져스";
        avengers.review = "지구를 지켜라!";
        reviews[0] = avengers;

        MovieReview coco = new MovieReview();
        coco.title = "코코";
        coco.review = "인생영화";
        reviews[1] = coco;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + ", " + "리뷰 : " + review.review);
        }

    }
}
