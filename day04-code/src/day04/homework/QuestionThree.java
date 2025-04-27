package day04.homework;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = 0;
        while (principle < 1000) {
            System.out.println("请输入存款金额(起存金额1000元):");
            principle = sc.nextDouble();
        }
        int numYear = 0;
        while (numYear != 1 && numYear != 2 && numYear!= 3 && numYear!= 5 ) {
            System.out.println("请输入存款年限(1,2,3,5):");
            numYear = sc.nextInt();
        }
        double interestRate = 0;
        switch (numYear) {
            case 1 -> interestRate = 2.25 / 100;
            case 2 -> interestRate = 2.7 / 100;
            case 3 -> interestRate = 3.25 / 100;
            case 5 -> interestRate = 3.6 / 100;
        }
        double interest = Math.pow(1+ interestRate, numYear) * principle - principle;
        System.out.printf("到期后本息总额预计为%.2f元\n", principle + interest);
    }
}
