public class main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damege = 10;
    Hero h = new Hero();
    h.name = "湊";
    h.hp = 100;
    h. sword = s;
    System.out.println("現在の武器は" + h.sword.name);
  }
}