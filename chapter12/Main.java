public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard();
    Matango m = new Matango();
    w.name = "朝";
    w.attack(m);
    w.fireball(m);
  }
}