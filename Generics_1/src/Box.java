public class Box<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        integerBox.set(new Integer(10));
        System.out.println(integerBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(new Double(10.125478541));
        System.out.println(doubleBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set(new String("qwer"));
        System.out.println(stringBox.get());

        Box<Float> floatBox = new Box<>();
        floatBox.set(new Float(1.1111));
        System.out.println(floatBox.get());

        Box<Long> longBox = new Box<>();
        longBox.set(new Long(2147483647L));
        System.out.println(longBox.get());

        Box<int[]> arrayBox = new Box<>();
        arrayBox.set(new int[]{1,2,3});
        for(int i: arrayBox.get())
            System.out.print(i+" ");
    }
}