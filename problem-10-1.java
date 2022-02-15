class Accumulator {
    static int accumulator;

    static void add(int num) {
        accumulator = num + accumulator;
        }

    static void showResult() {
        System.out.println(accumulator);
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Accumulator.add(i);
        }
        Accumulator.showResult();

    }
}