package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = -1;
        while(flag != 0 && flag != 1) {
            System.out.println("欢迎进入双色球系统! 输入0输入自选号码,输入1则随机生成号码:");
            flag = sc.nextInt();
            if (flag != 0 && flag != 1) {
                System.out.println("输入有误,请重新输入!");
            }
        }

        int[] redPick = new int[6];
        int[] bluePick = new int[1];
        int[] redWin;
        int[] blueWin;

        if(flag == 0) {
            System.out.println("请输入6个红球号码(1-33):");
            for (int i = 0; i < redPick.length; ) {
                redPick[i] = sc.nextInt();
                if (duplicateCheck(redPick, i) && rangeCheck(redPick[i], 1, 33)) {
                    i++;
                } else if (!(duplicateCheck(redPick, i))) {
                    System.out.println("输入的号码重复,请重新该输字!");
                } else if (!(rangeCheck(redPick[i], 1, 33))) {
                    System.out.println("输入的号码超出范围,请重新该输字!");
                }
            }
            insertSort(redPick);
            System.out.println("您选择的红球号码是: " + Arrays.toString(redPick));

            System.out.println("请输入1个蓝球号码(1-16):");
            for (int i = 0; i < bluePick.length; ) {
                bluePick[i] = sc.nextInt();
                if (duplicateCheck(bluePick, i) && rangeCheck(bluePick[i], 1, 16)) {
                    i++;
                } else if (!(duplicateCheck(bluePick, i))) {
                    System.out.println("输入的号码重复,请重新该输字!");
                } else if (!(rangeCheck(bluePick[i], 1, 16))) {
                    System.out.println("输入的号码超出范围,请重新该输字!");
                }
            }
            insertSort(bluePick);
            System.out.println("您选择的蓝球号码是: " + Arrays.toString(bluePick));
        } else {
            System.out.println("随机红球号码生成中...");
            redPick = draw(33, 6);
            insertSort(redPick);
            System.out.println("您选择的随机红球号码是: " + Arrays.toString(redPick));
            System.out.println("随机蓝球号码生成中...");
            bluePick = draw(16, 1);
            insertSort(bluePick);
            System.out.println("您选择的随机蓝球号码是: " + Arrays.toString(bluePick));
        }

        System.out.println("抽奖开始!");
        System.out.println("红球开奖结果如下:");
        redWin = draw(33, 6);
        insertSort(redWin);
        System.out.println("红球中奖号码组合为" + Arrays.toString(redWin));
        System.out.println("您选择的红球号码是: " + Arrays.toString(redPick));
        System.out.println("蓝球开奖结果如下:");
        blueWin = draw(16, 1);
        insertSort(blueWin);
        System.out.println("蓝球中奖号码组合为" + Arrays.toString(blueWin));
        System.out.println("您选择的蓝球号码是: " + Arrays.toString(bluePick));

        int redMatchCount = matchCount(redPick, redWin);
        int blueMatchCount = matchCount(bluePick, blueWin);
        System.out.println("计算奖金分配中...");
        rewardCalculation(redMatchCount, blueMatchCount);
    }

    public static int[] draw(int totalNums, int numsToPick) {
        int[] pool = new int[totalNums];
        int[] winingNumbers = new int[numsToPick];
        for (int i = 0; i < totalNums; i++) pool[i] = i + 1;
        Random r = new Random();
        int scope = pool.length;
        for (int j = 0; j < numsToPick; j++) {
            int pickIndex = r.nextInt(scope);
            for (int k = pickIndex; k < (scope - 1); k++) {
                int temp = pool[k];
                pool[k] = pool[k + 1];
                pool[k + 1] = temp;
            }
            System.out.println("第" + (j + 1) + "个号码是：" + pool[scope - 1]);
            scope--;
        }
        for (int i = 0; i < winingNumbers.length; i++) {
            winingNumbers[i] = pool[pool.length - 1 - i];
        }
        insertSort(winingNumbers);
        return winingNumbers;
    }

    public static void insertSort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;
            while (j > 0 && key < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = key;
            }
        }
    }

    public static int matchCount(int[] yourNumbers, int[] winingNumbers) {
        int count = 0;
        for (int yourNumber : yourNumbers) {
            for (int winingNumber : winingNumbers) {
                if (yourNumber < winingNumber) {
                    break;
                } else if (yourNumber == winingNumber) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static boolean duplicateCheck(int[] arr, int idx) {
        for (int i = 0; i < idx; i++) {
            if (arr[i] == arr[idx]) {
                return false;
            }
        }
        return true;
    }

    public static boolean rangeCheck(int n, int start, int end) {
        return n >= start && n <= end;
    }

    public static void rewardCalculation(int redMatchCount, int blueMatchCount) {
        int rank = redMatchCount * 10 + blueMatchCount;
        System.out.println("您猜中了" + redMatchCount + "个红球和" + blueMatchCount + "个蓝球");
        switch (rank) {
            case 61:
                System.out.println("恭喜您中了一等奖，最高奖金为1000万！");
                break;
            case 60:
                System.out.println("恭喜您中了二等奖，最高奖金为500万！");
                break;
            case 51:
                System.out.println("恭喜您中了三等奖,奖金为3000元！");
                break;
            case 50:
            case 41:
                System.out.println("恭喜您中了四等奖,奖金为200元！");
                break;
            case 40:
            case 31:
                System.out.println("恭喜您中了五等奖,奖金为10元！");
                break;
            case 21:
            case 11:
            case 1:
                System.out.println("恭喜您中了六等奖,奖金为5元！");
                break;
            default:
                System.out.println("很遗憾,您没有中奖！");
                break;
        }
    }
}
