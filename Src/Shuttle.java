public class Shuttle {

    public static void main(String[] args) {

        int shuttls = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(shuttls);
                shuttls++;

            if ((shuttls - 4) % 10 == 0) {
                shuttls++;
            }

            if ((shuttls - 9) % 10 == 0) {
                 shuttls++;
            }

            if ((shuttls - 100 * (shuttls / 100)) / 10 == 4) {
                 shuttls += 10;
            }

            if ((shuttls - 100 * (shuttls / 100)) / 10 == 9) {
                 shuttls += 10;
            }
        }
    }
}
