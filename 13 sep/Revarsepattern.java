class Revarsepattern {
    Revarsepattern() {
    }

    static void secondPattern(int var0) {
        for(int var1 = var0; var1 >= 1; --var1) {
            System.out.println();

            for(int var2 = 0; var2 < var1; ++var2) {
                System.out.print("*");
            }
        }

    }

    public static void main(String... var0) {
        int var1 = Integer.parseInt(var0[0]);
        secondPattern(var1);
    }
}
