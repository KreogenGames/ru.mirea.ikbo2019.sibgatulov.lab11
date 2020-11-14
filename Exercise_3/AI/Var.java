package Exercise_3.AI;

import Exercise_3.Fun.Exp;

public class Var implements Exp {
    private final String name;

    public Var(String name) {
        this.name = name;
    }

    public int evaluate(int x, int y, int z) {
        return name.equals("x") ? x : name.equals("y") ? y : name.equals("z") ? z : 0;
    }
}