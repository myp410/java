public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")){
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場するいちは" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaは登場するいちは" + s1.lastIndexOf("Java"));
  }