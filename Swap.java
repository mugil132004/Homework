class Swap {
    int a, b;
}
 class Main {
    static void swap(Swap obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    public static void main(String[] args) {
        Swap obj = new Swap();
        obj.a = 10;
        obj.b = 20;

        System.out.println("Before swap: a = " + obj.a + ", b = " + obj.b);

        swap(obj);

        System.out.println("After swap: a = " + obj.a + ", b = " + obj.b);
    }
}
