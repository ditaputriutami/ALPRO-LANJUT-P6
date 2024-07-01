public class Array_2 {
  public static void main(String[] args) {
    String[][] cats = {{"terry", "brown"},
                        {"kitty", "white"},
                        {"toby", "gray"},
                        {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    for (int i = 0; i < cats.length; i++) {
      try {
        for (int j = 0; j < cats[i].length; j++) {
          System.out.print(cats[i][j] + "\t");
        }
        System.out.println();
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Index error: Encountered invalid cat information.");
  }
}
}
}