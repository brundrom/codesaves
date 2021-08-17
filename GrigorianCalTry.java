import java.util.Scanner;

class MyProgFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        boolean isVisokos = false;
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        if (day <= 0 | month <= 0 | year <= 0) {
            isValid = false;
        } else {
            if (year > 3000) isValid = false; else {
                if (month > 12) isValid = false; else {

                    if (year % 4 == 0) {
                        if (year % 100 == 0 && year % 400 != 0) isVisokos = false;
                        else isVisokos = true;
                    } else isVisokos = false;

                    if (isVisokos == false) {
                        if (day > 28 && month == 2) isValid = false; else {
                            if (day > 31) isValid = false; else {
                                if (day > 30 && (month == 4 | month == 6 | month == 9 | month == 11)) isValid = false; else isValid = true;
                            }
                        }
                    }

                    if(isVisokos == true) {
                        if (day > 29 && month == 2) isValid = false; else {
                            if (day > 31) isValid = false; else {
                                if (day > 30 && (month == 4 | month == 6 | month == 9 | month == 11)) isValid = false; else isValid = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(isValid);
    }
}
