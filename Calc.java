package caclcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a, b);
    int delta = calpspp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}