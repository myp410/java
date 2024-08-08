public class Hero {
  String name;
  int hp;
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o instanceof Hero h) {
      if (this.name.equals(h.name)) {
        retuen false;
      }
    }
    return false;
  }
}