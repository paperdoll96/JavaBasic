package class1;

/*
    이전 문제인 ClassStart1에 배열을 적용해보자!
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" +
                    studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }

    /*
        배열을 사용한 덕분에 학생이 추가되어도 배열에 학생의 데이터만 추가하면 된다. 이제 변수를 더 추가하지 않아도 되고,
        출력 부분의 코드도 그대로 유지할 수 있다!

        배열을 사용해서 코드를 최소화 하는데는 성공 했지만, 데이터가 3개의 배열에 나누어져있다..
        따라서 데이터를 변경할 경우 매우 조심해서 작업해야 된다!
        예를 들어 학생 2의 데이터를 관리하기위해 배열의 인덱스 순서를 항상 정확하게!! 맞춰야한다!
        지금은 데이터가 많지 않지만 만약에 몇백가지 몇천가지 데이터라면..?
        그럼 실수할 가능성이 매우 높아진다!
        그래서 사람이 관리하기에는 좋은 코드가 아니다..

     */
}
