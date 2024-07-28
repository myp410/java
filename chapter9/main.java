public class main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "湊";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "朝香";
    h2.hp = 100;
    Wizard w = new Wizard();
    w.name = "菅原";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}