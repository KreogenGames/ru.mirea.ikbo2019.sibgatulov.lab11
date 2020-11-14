package Exercise_1;

public class TestAQM {
    public static void main(String[] args) {
        fill();
        dump();
        fill();
        clear();
        fill();
        getArray();
    }

    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQModule.enqueue(i);
        }
    }

    public static void getArray() {
        Object[] arr = ArrayQModule.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }

    public static void dump() {
        while (!(ArrayQModule.isEmpty())) {
            System.out.println(ArrayQModule.size() + " " + ArrayQModule.element() + " " + ArrayQModule.dequeue());
        }
    }

    public static void clear() {
        ArrayQModule.clear();
        System.out.println(ArrayQModule.isEmpty());
    }
}
