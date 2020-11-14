package Exercise_1;

public class TestAQADT {
    public static void main(String[] args) {
        ArrayQADT queue = new ArrayQADT();
        fill(queue);
        dump(queue);
        fill(queue);
        clear(queue);
        fill(queue);
        getArray(queue);
    }

    public static void fill(ArrayQADT queue) {
        for (int i = 0; i < 10; i++) {
            ArrayQADT.enqueue(queue, i);
        }
    }

    public static void getArray(ArrayQADT queue) {
        Object[] arr = ArrayQADT.toArray(queue);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void dump(ArrayQADT queue) {
        while (!ArrayQADT.isEmpty(queue)) {
            System.out.println(
                    ArrayQADT.size(queue) + " " + ArrayQADT.element(queue) + " " + ArrayQADT.dequeue(queue));
        }
    }

    public static void clear(ArrayQADT queue) {
        ArrayQADT.clear(queue);
        System.out.println(ArrayQADT.isEmpty(queue));
    }
}
