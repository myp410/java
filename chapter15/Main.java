import java.util.*;

public class Main {
  public static void main(String[] args) {
    Calender c = Calender.getInstance();
    c.set(2023,8,18,5,53,20);
    c.set(Calender.MONTH,9);
    Date d = c.getTime();
    System.out.println(d);
    Date now = new Date();
    c.setTime(now);
    int y = c.get(Calender.YEAR);
    System.out.println("今年は" + y + "年です");
  }
}  