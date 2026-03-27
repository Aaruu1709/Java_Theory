package Coding_Programs.StreamProgram;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class CheckIfAnyMatch {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<Integer>();
      number.add(10);
      number.add(30);
      number.add(80);
      number.add(9);

      boolean result=number.stream().anyMatch(x->x>10);
        System.out.println(result);
    }
}
//“anyMatch checks if any element satisfies condition.”