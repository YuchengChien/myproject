package com.jason.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Calendar  now = Calendar.getInstance();
        System.out.println(now.get(Calendar.DAY_OF_YEAR));
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year: (" + year + ")");
            String yearString = bufferedReader.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            System.out.println(year);

            System.out.println("Please enter month: (" + month + ")");
            String monthString = bufferedReader.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            System.out.println(month);

            System.out.println("Please enter day: (" + day + ")");
            String dayString = bufferedReader.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) : day;
            System.out.println(day);

            int days = day;
            for(int i = 0; i < (month -  1); i++) {
                days += months[i];
            }
            //  閏年判斷
            if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
                days += 1;
            }
            System.out.println(days);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
