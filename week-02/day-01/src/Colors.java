public class Colors {
  public static void main(String[] args) {
    // - Create a two dimensional array
    //   which can contain the different shades of specified colors
    // - In `colors[0]` store the shades of green:
    //   `"lime", "forest green", "olive", "pale green", "spring green"`
    // - In `colors[1]` store the shades of red:
    //   `"orange red", "red", "tomato"`
    // - In `colors[2]` store the shades of pink:
    //   `"orchid", "violet", "pink", "hot pink"`
    String matrix[][] = {{"lime", "forest green", "olive", "pale green", "spring green"},
                        {"orange red", "red", "tomato"},
                        {"orchid", "violet", "pink", "hot pink"}};
    //klasszik
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(matrix[i][j]);
      }
    }
    //opt
    for (String mat1[] : matrix) {
      for ( String mat2 : mat1) {
        System.out.println(mat2);
      }
    }
  }
}
