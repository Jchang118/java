package homework;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class QuestionThree {
    public static void main(String[] args) {
        String[] employeeNames = {"张三", "李四", "王五", "赵六", "田七"};
        int[] employeeSalary = {3000, 3500, 4000, 4500, 5000};

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        for (int i = 0; i < employeeNames.length; i++) {
            employeeList.add(new Employee(employeeNames[i], employeeSalary[i]));
        }
        printEmployeeList(employeeList);
        System.out.println("--------------------------");

        // 判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals("王五")) {
                employeeList.get(i).setName("王小五");
            }
        }
        printEmployeeList(employeeList);
        System.out.println("--------------------------");

        // 判断是否有姓名为“赵六”的员工，如果有，将其删除
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals("赵六")) {
                employeeList.remove(i);
            }
        }
        printEmployeeList(employeeList);
        System.out.println("--------------------------");

        // 给姓名为“田七”的员工，涨500工资
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals("田七")) {
                employeeList.get(i).setSalary(employeeList.get(i).getSalary() + 500);
            }
        }
        printEmployeeList(employeeList);
    }

    public static void printEmployeeList(ArrayList<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("姓名: " + employeeList.get(i).getName() + ", 工资: " + employeeList.get(i).getSalary());
        }
    }
}
