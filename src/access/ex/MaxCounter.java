package access.ex;

public class MaxCounter {

   private int count; // 내부에서 사용하는 숫자로  private 사용
   private int max;  // 최대값설정  데이터는 왠만하면 캡슐화하자!

    public MaxCounter(int max) {
        this.max = max;
    }

   public void increment() { // 숫자를 하나 증가시키는 메서드 최대값보다 크면 메세지 출력 후 리턴
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
       count++;
   }

   public int getCount() { // 증가된 값을 반환하는 메소드
       return count;
   }

}
