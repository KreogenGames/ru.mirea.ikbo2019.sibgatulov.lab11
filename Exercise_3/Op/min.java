package Exercise_3.Op;

import Exercise_3.Fun.TE;

public class min extends Oper{
    public min(TE left, TE right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }

    protected double evaluate(double left, double right) {
        return left - right;
    }
}
