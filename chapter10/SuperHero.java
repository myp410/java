public class SuperHero {
  String name = "湊";
  int hp = 100;
  boolean flying;
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("５ポイントのダメージを与えた！");
  }
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった");
  }
  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }
}