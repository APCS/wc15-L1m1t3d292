
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

  public static int[][] crop2D(int[][] mat, int startRow, int startCol,
      int endRow, int endCol)
  {
    int[][] arr = new int[(endRow - startRow) + 1][(endCol - startCol) + 1];
    for (int r = startRow; r <= endRow; r++)
      for (int c = startCol; c <= endCol; c++)
        arr[r - startRow][c - startCol] = mat[r][c];
    return arr;
  }

}