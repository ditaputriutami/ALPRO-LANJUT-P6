public class ExceptionHandlingMod4_Prak1 {
  public static void main(String[] args) {
    String[][] cats = {{"terry", "brown"},
                        {"kitty", "white"},
                        {"toby", "gray"},
                        {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // Loop through the cats array with a maximum index
    for (int i = 0; i < cats.length; i++) {
      try {
        System.out.println(cats[i][0] + "\t\t" + cats[i][1]);
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Index error: Encountered invalid cat information.");
      }
    }
  }
}
