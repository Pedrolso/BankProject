package entities;

import java.util.Calendar;

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
    }

    /*public Calendar checkDate() {
        Calendar calendar = Calendar.getInstance();

        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            calendar.add(Calendar.DATE, 1);
            return calendar;
        } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            calendar.add(Calendar.DATE, 2);
            return calendar;
        }
        System.out.println("DIA DA SEMANA");
        return calendar;
    }*/
}
