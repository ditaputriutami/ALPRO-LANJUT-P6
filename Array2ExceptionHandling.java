public class Array2ExceptionHandling {
  public static void main(String[] args) {
    String[][] cats = {{"terry", "brown"},
                        {"kitty", "white"},
                        {"toby", "gray"},
                        {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // Loop through cats with a maximum index
    for (int i = 0; i < 12; i++) {
      try {
        System.out.println(cats[i][0] + "\t\t" + cats[i][1]);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Index error: Cat information unavailable.");
  }
}
}
}