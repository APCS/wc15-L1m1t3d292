
/**
 * WC15 - This is a review of all kinds of concepts.
 * Only use AP official subset methods for ArrayLists, Strings, 1D arrays, etc.
 * These methods focus on various arrays, loops, and whatever else I think
 * you need practice on.
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class WC15
{
  public static final int DIVIDE_BY_TWO = 2;

  public static String centralThree(String letters)
  {
    return letters.substring(letters.length() / DIVIDE_BY_TWO - 1,
      letters.length() / DIVIDE_BY_TWO + DIVIDE_BY_TWO);
  }

  public static String chopFront(String str)
  {
    String word = "";
    if (str.substring(0, 1).equals("a"))
      word += "a";
    if (str.substring(1, 2).equals("b"))
      word += "b";
    if (str.length() > 1)
      word += str.substring(2, str.length());
    return word;
  }

  public static String hateX(String str)
  {
    String word = "";
    if (!str.substring(0, 1).equals("x"))
      word += str.substring(0, 1);
    if (!str.substring(1, 2).equals("x"))
      word += str.substring(1, 2);
    if (str.length() > 1)
      word += str.substring(2, str.length());
    return word;
  }

  public static void swapRows(int[][] mat, int rowAIndex, int rowBIndex)
  {
    int[] temp = mat[rowAIndex];
    mat[rowAIndex] = mat[rowBIndex];
    mat[rowBIndex] = temp;
  }

  public static void swapColumns(int[][] mat, int colAIndex, int colBIndex)
  {
    int[] temp = new int[mat.length];
    for (int i = 0; i < mat.length; i++)
    {
      temp[i] = mat[i][colAIndex];
      mat[i][colAIndex] = mat[i][colBIndex];
      mat[i][colBIndex] = temp[i];
    }
  }

  /**
   * Returns an array with the specified number of rows and columns containing
   * the characters from str in row-major order. If str.length() is greater than
   * rows * cols, extra characters are ignored. If str.length() is less than
   * rows * cols, the remaining elements in the returned array contain null.
   * 
   * @param str
   *          the string to be placed in an array
   * @param rows
   *          the number of rows in the array to be returned
   * @param cols
   *          the number of columns in the array to be returned
   * @return an array containing the characters from str in row-major order
   */
  public static String[][] fill2DWithLetters(String str, int rows, int cols)
  {
    String[][] arr = new String[rows][cols];
    int length = 0;
    if (str.length() > rows * cols && length <= rows * cols)
      for (int r = 0; r < rows; r++)
        for (int c = 0; c < cols; c++)
        {
          arr[r][c] = str.substring(length, length + 1);
          length++;
        }
    else if (str.length() < rows * cols)
      for (int r = 0; r < rows; r++)
        for (int c = 0; c < cols; c++)
          if (length < str.length())
          {
            arr[r][c] = str.substring(length, length + 1);
            length++;
          }
    return arr;
  }

  /**
   * Returns an array with the specified number of rows and columns that
   * contains the elements of vals in the order specified below. Elements from
   * vals are placed in the array by moving down the first column, up the second
   * column and so on.
   * 
   * <pre>
   * For example, if vals was:
   * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
   * 
   * rows was 3 and cols was 4,
   * the returned array would be:
   * { {1, 6, 7, 12},
   *   {2, 5, 8, 11},
   *   {3, 4, 9, 10} }
   * 
   * Precondition: vals.length == rows * cols
   * </pre>
   * 
   * @param vals
   *          the elements
   * @param rows
   *          the number of rows in the array to be returned
   * @param cols
   *          the number of columns in the array to be returned
   * @return an array containing the elements from vals in the specified order
   */
  public static int[][] fillDownAndUp(int[] vals, int rows, int cols)
  {
    return new int[][] {{42}};
  }

  /**
   * Returns a smaller array containing the elements in the specified range of
   * the mat.
   * 
   * For example,
   * 
   * <pre>
   * mat: { {10, 9, 8, 7}, 
   *        {6, 5, 4, 3}, 
   *        {2, 1, -1, 0} }
   * 
   * startRow: 0, startCol: 1, endRow: 1, endCol: 2
   * 
   * would yield: { {9, 8},
   *                {5, 4} }
   * </pre>
   * 
   * @param mat
   *          the 2D array containing the original elements
   * @param startRow
   *          the first row to be kept
   * @param startCol
   *          the first column to be kept
   * @param endRow
   *          the last row to be kept
   * @param endCol
   *          the last column to be kept
   * @return a smaller array containing the specified elements
   */
  public static int[][] crop2D(int[][] mat, int startRow, int startCol,
    int endRow, int endCol)
  {
    return new int[][] {{42}};
  }

}