
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

  public static int[][] fillDownAndUp(int[] vals, int rows, int cols)
  {
    int[][] arr = new int[rows][cols];
    int count = 0;
    int rVal = 0;
    int cVal = 0;
    for (int c = 0; c < vals.length; c++)
    {
      if (rVal < rows && cVal < cols)
      {
        for (int i = 0; i < rows; i++)
        {
          arr[rVal][cVal] = vals[c];
          rVal++;
          count++;
          if (c < vals.length - 1)
            c++;
        }
        cVal++;
      }
      if (count == rows && cVal < cols)
      {
        rVal--;
        for (int i = 0; i < rows; i++)
        {
          arr[rVal][cVal] = vals[c];
          if (rVal > 0)
            rVal--;
          count--;
          if (c < vals.length - 1 && i + 1 != rows)
            c++;
        }
        cVal++;
      }
    }
    return arr;
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