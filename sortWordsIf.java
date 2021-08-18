import java.util.Scanner;

class MyProgSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();

        String w1Up = w1.toUpperCase();
        String w2Up = w2.toUpperCase();
        String w3Up = w3.toUpperCase();

        if ((w1Up.charAt(0) < w2Up.charAt(0)) && (w1Up.charAt(0) < w3Up.charAt(0)) && (w2Up.charAt(0) < w3Up.charAt(0))) {
            System.out.println(w1);
            System.out.println(w2);
            System.out.println(w3);
        }

        if ((w1Up.charAt(0) < w2Up.charAt(0)) && (w1Up.charAt(0) < w3Up.charAt(0)) && (w3Up.charAt(0) < w2Up.charAt(0))) {
            System.out.println(w1);
            System.out.println(w3);
            System.out.println(w2);
        }

        if ((w2Up.charAt(0) < w1Up.charAt(0)) && (w2Up.charAt(0) < w3Up.charAt(0)) && (w1Up.charAt(0) < w3Up.charAt(0))) {
            System.out.println(w2);
            System.out.println(w1);
            System.out.println(w3);
        }

        if ((w2Up.charAt(0) < w1Up.charAt(0)) && (w2Up.charAt(0) < w3Up.charAt(0)) && (w3Up.charAt(0) < w1Up.charAt(0))) {
            System.out.println(w2);
            System.out.println(w3);
            System.out.println(w1);
        }

        if ((w3Up.charAt(0) < w1Up.charAt(0)) && (w3Up.charAt(0) < w2Up.charAt(0)) && (w1Up.charAt(0) < w2Up.charAt(0))) {
            System.out.println(w3);
            System.out.println(w1);
            System.out.println(w2);
        }

        if ((w3Up.charAt(0) < w1Up.charAt(0)) && (w3Up.charAt(0) < w2Up.charAt(0)) && (w2Up.charAt(0) < w1Up.charAt(0))) {
            System.out.println(w3);
            System.out.println(w2);
            System.out.println(w1);
        }
    }
}
