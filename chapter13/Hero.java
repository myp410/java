public class Hero {
  private int hp;
  private String name;
  Sword sword;
  
  public void bye() {
    System.out.println("勇者は別れを告げた");
  }
  private void die() {
    System.out.println(this.name + "は死んでしまった");
    System.out.println("GAME OVERです");
  }
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した");
  }
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("お化けきのこ" + m.suffix + "から２ポイントの反撃を受けた");
    this.hp -= 2;
    if (this.hp <= 0 ) {
      this.die();
    }
  }
  public String getName() {
    return this.name;
  }
} 