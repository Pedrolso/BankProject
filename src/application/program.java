package application;

import entities.BusinessAccount;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        /*Calendar date = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");*/

        BusinessAccount bs = new BusinessAccount();

        bs.loan();

        System.out.println();


    }
}

