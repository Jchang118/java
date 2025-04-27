package day04.homework;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        double salary, taxableIncome, tax, netSalary;
        double band1Full = 3000 * 0.03;
        double band2Full = (12000 - 3000) * 0.1;
        double band3Full = (25000 - 12000) * 0.2;
        double band4Full = (35000 - 25000) * 0.25;
        double band5Full = (55000 - 35000) * 0.3;
        double band6Full = (80000 - 55000) * 0.35;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资:");
        salary = sc.nextDouble();
        taxableIncome = salary * 0.9 - 5000;
        if (taxableIncome > 80000) {
            tax = (taxableIncome - 80000) * 0.45 + band1Full + band2Full + band3Full + band4Full + band5Full + band6Full;
        } else if (taxableIncome > 55000) {
            tax = (taxableIncome - 55000) * 0.35 + band1Full + band2Full + band3Full + band4Full + band5Full;
        } else if (taxableIncome > 35000) {
            tax = (taxableIncome - 35000) * 0.3 + band1Full + band2Full + band3Full + band4Full;
        } else if (taxableIncome > 25000) {
            tax = (taxableIncome - 25000) * 0.25 + band1Full + band2Full + band3Full;
        } else if (taxableIncome > 12000) {
            tax = (taxableIncome - 12000) * 0.2 + band1Full + band2Full;
        } else if (taxableIncome > 3000) {
            tax = (taxableIncome - 3000) * 0.1 + band1Full;
        } else if (taxableIncome > 0) {
            tax = taxableIncome * 0.03;
        } else {
            tax = 0;
        }
        netSalary = salary * 0.9 - tax;
        System.out.printf("当月应缴纳税款%.2f元,税后到手工资%.2f元\n", tax, netSalary);
    }
}
