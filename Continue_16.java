import java.util.*;
import java.io.*;

public class Continue_16 {

  public static void main(String[] args) {
    int length = 0;
    System.out.println("Continue statement");
    while (length < 10) {

      if (length == 8) {
        length++;

        continue;
      }

      System.out.println(length);
      length++;

    }

  }
}
