class Dog {
  private int size;

  public void setSize(int number) {
    size = number;
  }

  public void bark() {
    String barkSound;

    if (size > 50) {
      barkSound = "Ruff! Ruff";
    } else {
      barkSound = "Yip! Yip";
    }

    System.out.println(barkSound);
  }
}
