public class Hero {
  String name = "湊";
  int hp = 100;
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
  }
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  public final void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は転んだ！");
    System.out.println("５のダメージ");
  }

}