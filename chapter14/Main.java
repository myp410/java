public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "湊";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "湊";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容のです");
    } else {
      System.out.println("違う内容です");
    }
  }
}  