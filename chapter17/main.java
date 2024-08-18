import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
       FileWriter fw = new FileWriter("data.text");
    } catch (IOExcaption e) {
      System.out.println("エラーが発生しました");
    } 
   
  }
}