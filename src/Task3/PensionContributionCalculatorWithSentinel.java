package Task3;
import java.util.Scanner;
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        final double SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;


        int salary,age;
        double contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        System.out.print("Введите месячную зарплату : ");
        salary = in.nextInt();

        while (salary <= SALARY_CEILING) {
            System.out.print("Укажите возраст: ");
            age = in.nextInt();
            if (age <= 55) {
                employeeContribution = (salary * EMPLOYEE_RATE_55_AND_BELOW);
                employerContribution = (salary * EMPLOYER_RATE_55_AND_BELOW);
            } else if (age <= 60 && age >= 56) {
                employeeContribution = (salary * EMPLOYEE_RATE_55_TO_60);
                employerContribution = (salary * EMPLOYER_RATE_55_TO_60);
            } else if (age <= 65 && age >= 61) {
                employeeContribution = (salary * EMPLOYEE_RATE_60_TO_65);
                employerContribution = (salary * EMPLOYER_RATE_60_TO_65);
            } else {
                employeeContribution = (salary * EMPLOYEE_RATE_65_ABOVE);
                employerContribution = (salary * EMPLOYER_RATE_65_ABOVE);
            }
            contributableSalary = employeeContribution + employerContribution;
            System.out.print("Взнос работника: " + employeeContribution + " долларов США.\n");
            System.out.print("Взнос работодателя составляет: " + employerContribution + " долларов США.\n");
            System.out.print("Общий взнос: ");
            String result = String.format("%.2f",contributableSalary);
            System.out.print(result);
            System.out.print(" $\n");
            System.exit(0);

        }
        System.out.print("Impossible, bye!");

    }

}
