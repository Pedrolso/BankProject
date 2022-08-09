package application;

import entities.Account;
import entities.BusinessAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Account> list = new ArrayList<>();

        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Create Account");
                System.out.println();
                System.out.print("Account type: n = Normal Account  b = Business Account");
                char acc = sc.next().charAt(0);

                System.out.println("Account number");
                int acNumber = sc.nextInt();
                System.out.println("Name");
                String name = sc.nextLine();
                System.out.println("E-mail");
                String email = sc.nextLine();
                System.out.println("Birth (dd/mm/yyyy)");
                Date birth = sdf.parse(sc.nextLine());
                System.out.println("Initial deposit");
                double deposit = sc.nextDouble();

                if (acc == 'n') {
                    Account ac = new Account(acNumber, name, email, birth, deposit);
                    list.add(ac);
                } else if (acc == 'b') {
                    System.out.println("ID Company: ");
                    int idCompany = sc.nextInt();
                    Account bac = new BusinessAccount(acNumber, name, email, birth, deposit, idCompany);
                    list.add(bac);
                }
                break;
            case 2:
                for (Account c : list) {
                    System.out.println(c);
                }
                break;
            case 3:
                System.out.println("Number account");
                int nAc = sc.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    if(nAc==list.getClass(acNumber)){
                        System.out.println(list.get(acNumber));
                    }
                }
                break;
        }

    }
}

