import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int temp;

        System.out.print("Sıcaklık: ");
        temp = inp.nextInt();

        // I. yol
        if (temp<5) {
        	System.out.println("Kayak yapabilirsiniz.");
        } else if ( temp>=5 && temp<=15 ) {
        	System.out.println("Sinemaya gidebilirsiniz.");
        }else if ( temp>25 && temp<100 ) {
        	System.out.println("Yüzmeye gidebilirsiniz.");
        }
        if (temp>=10 && temp<=25) {
        	System.out.print("Piknik yapabilirsiniz.");
        }if ( temp >=100 ) {
            System.out.println("Kaynamak istemiyorsanız dışarı çıkamamalısınız.");
        }

        // II. yol
        /*
        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp >= 5 && temp < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temp >= 10 && temp <= 15) {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        } else if (temp > 15 && temp <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else if (temp > 25 && temp<100) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }else {
            System.out.println("Kaynamak istemiyorsanız dışarı çıkamamalısınız.");
        }
        */


    }
}
