import java.util.Scanner;

public class AverageTaxWithholding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWithholding = 0;

        System.out.print("Enter the number of weeks: ");
        int weeks = scanner.nextInt();

        for (int i = 1; i <= weeks; i++) {
            System.out.print("Enter income for week " + i + ": ");
            double income = scanner.nextDouble();
            double taxRate;

            if (income < 500) {
                taxRate = 0.10;
            } else if (income >= 500 && income < 1500) {
                taxRate = 0.15;
            } else if (income >= 1500 && income < 2500) {
                taxRate = 0.20;
            } else {
                taxRate = 0.30;
            }

            double withholding = income * taxRate;
            totalWithholding += withholding;
        }

        double averageWithholding = totalWithholding / weeks;
        System.out.printf("Average Weekly Tax Withholding: $%.2f\n", averageWithholding);
    }
}
