package Exercise_3;

import Exercise_3.Op.*;
import Exercise_3.AI.*;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(
                new plus(
                        new min(
                                new umn(
                                        new Var("x"),
                                        new Var("x")
                                ),
                                new umn(
                                        new Const(2),
                                        new Var("x")
                                )
                        ),
                        new Const(1)
                ).evaluate(x, x, x));
    }
}