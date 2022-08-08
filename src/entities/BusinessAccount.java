package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BusinessAccount extends Account {

    private int idCompany;

    //CONSTRUTOR
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String name, String email, Calendar birth, double initialBalance, int idCompany) {
        super(number, name, email, birth, initialBalance);
        this.idCompany = idCompany;
    }

    //GETTER SETTER
    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    //METODOS
    public void loan() {
        balance += balance * 0.5;

        Calendar date = Calendar.getInstance();
        checkDate(date);
    }

    public Calendar checkDate(Calendar data) {
        System.out.println("Loan pay day");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        data.add(Calendar.DATE, 31);

        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            data.add(Calendar.DATE, 1);
            System.out.println(sdf.format(data.getTime()));
        } else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            data.add(Calendar.DATE, 2);
            System.out.println(sdf.format(data.getTime()));
        } else {
            System.out.println(sdf.format(data.getTime()));
        }
        return data;
    }
}

