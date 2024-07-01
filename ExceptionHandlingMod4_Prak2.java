public class ExceptionHandlingMod4_Prak2 {
  public static void main(String[] args) {
    String[][] cats = {{"terry", "brown"},
                        {"kitty", "white"},
                        {"toby", "gray"},
                        {"fido", "black"}};
    System.out.println("Nama Kucing\tWarna");

    // Loop through the outer array (cats)
    for (int i = 0; i < cats.length; i++) {
      try {
        // Inner loop to print cat information (assuming cats is not jagged)
        for (int j = 0; j < cats[i].length; j++) {
          System.out.print(cats[i][j] + "\t\t");
        }
        System.out.println(); // New line after each cat
      } catch (IndexOutOfBoundsException e) {
        System.out.println("Index error: Encountered invalid cat information for cat " + (i + 1));
      }
    }
  }
}
