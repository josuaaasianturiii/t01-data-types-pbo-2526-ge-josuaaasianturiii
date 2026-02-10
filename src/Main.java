import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String soal = input.next(); // membaca Soal1 / Soal2 / Soal3 / Soal4 / Soal5

        if (soal.equals("Soal1")) {
            // Soal 1 — Integer Overflow Detection
            int a = input.nextInt();
            int b = input.nextInt();

            if (b > 0 && a > Integer.MAX_VALUE - b) {
                System.out.println("OVERFLOW");
            } else if (b < 0 && a < Integer.MIN_VALUE - b) {
                System.out.println("OVERFLOW");
            } else {
                int sum = a + b;
                System.out.println(sum);
            }
        }

     else if (soal.equals("Soal2")) {
    float xFloat = input.nextFloat();
    float yFloat = input.nextFloat();

    double xDouble = (double) xFloat;
    double yDouble = (double) yFloat;

    float sumFloat = xFloat + yFloat;
    double sumDouble = xDouble + yDouble;

    double diff = Math.abs(sumDouble - sumFloat);

    System.out.printf("%.6f\n", diff);
}


        else if (soal.equals("Soal3")) {
            // Soal 3 — Primitive vs Wrapper Comparison
            int N = input.nextInt();

            Integer a = N;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal4")) {
            // Soal 4 — String Immutability & Reference
            String S = input.next();

            String a = S;
            String b = new String(S);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        else if (soal.equals("Soal5")) {
            // Soal 5 — Parsing & Type Safety
            int integerVal = input.nextInt();
            double doubleVal = input.nextDouble();
            boolean boolVal = input.nextBoolean();

            double hasil = integerVal * doubleVal;

            if (boolVal == false) {
                hasil = hasil * -1;
            }

            System.out.printf("%.2f\n", hasil);
        }

        else {
            System.out.println("Input soal tidak valid!");
        }

        input.close();
    }
}
