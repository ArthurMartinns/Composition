import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevelEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departamentName = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();

        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();

        System.out.print("Salário base: ");
        double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevelEnum.valueOf(workerLevel), workerBaseSalary, new Departament(departamentName));

        System.out.print("Quantos contratos para esse trabalhador? ");
        int quantityContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantityContracts; i++) {
            System.out.printf("Entre com os dados do contrato #%d:%n", i + 1);

            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duração (horas): ");
            int hours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre com mês e ano (MM/YYYY): ");
        String monthAndYear = sc.nextLine();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.printf("Renda em %s: %.2f%n", monthAndYear, worker.income(month, year));

        sc.close();
    }
}
