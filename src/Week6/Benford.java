package Week6;

class Benford {

    /* METHODES UTILTAIRES FOURNIES*/

    // affichage  d'un tableau d'entiers
    public static void print(int[] tab) {
        for (int i = 0; i < tab.length; ++i) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    // affichage  d'un tableau de doubles
    public static void print(double[] tab) {
        for (int i = 0; i < tab.length; ++i) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] frequencies = new int[9];
        double[] numbers = new double[25];

        //  TEST 1.1
        System.out.println("Test 1.1 : ");
        fillWithSquare(numbers);
        print(numbers);
        System.out.println();
        // FIN TEST 1.1

        //TEST 1.2
        System.out.println("Test 1.2 : ");
        System.out.println(extractMaxDigit(0));
        System.out.println(extractMaxDigit(632));
        System.out.println(extractMaxDigit(-221));
        System.out.println(extractMaxDigit(-554.15));
        System.out.println(extractMaxDigit(0.00421));
        System.out.println();
        // FIN TEST 1.2

        //  TEST 1.3
        System.out.println("Test 1.3 : ");
        analyze(numbers, frequencies);
        print(frequencies);
        System.out.println();
        // FIN TEST 1.3

        // TEST 1.4
        System.out.println("Test 1.4 : ");
        testBenford(frequencies, numbers.length);
        // FIN TEST 1.4
    }

    static void fillWithSquare(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (double)(((i+1)*(i+1)) / 100.0);
        }
    }

    static int extractMaxDigit(double digit) {
        if (digit == 0) return 0;
        if (digit < 0) digit = -digit;
        while((digit >= 10) || (digit < 1)) {
            if (digit >= 10) digit /= 10;
            else digit *= 10;
        }
        return (int)digit;
    }

    static void analyze(double[] numbers, int[] occurence){
        for (double number : numbers) {
            occurence[extractMaxDigit(number) - 1] += 1;
        }
    }

    static void testBenford(int[] occurence, int number) {
        double total = 0;
        for (int i : occurence) total += i;
        System.out.println("Comparaison des frequences avec les predictions de la loi de Benford :");
        for (int i = 0; i < 9 ; i++) {
            System.out.println((i+1) + " : " + occurence[i]/total*100 + "%, Benford : " + 100*Math.log10(1 + 1.0/(i+1)) + "%");
        }
    }
}


