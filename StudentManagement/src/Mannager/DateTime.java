/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PCPAL
 */
public class DateTime {

    public DateTime() {
        GetSystemDateTime();
    }

    public String datetime;
    public String Today;
    public String ThisTime;
    public String DateString;

    /**
     * Get System Date And Time , Ex: DateTime.GetSystemDateTime();
     * DateTime.datetime; DateTime.Today; DateTime.ThisTime DateTime.DateString
     */
    private void GetSystemDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date();

        this.datetime = dateFormat.format(date);
        this.Today = datetime.substring(0, 11);
        this.ThisTime = datetime.substring(11, 16);
        this.DateString = date.toString().substring(0, 3);

    }

    /**
     * Input the Non-Formating date Return "yyyy-MM-dd" this formating String
     * Date
     *
     * @param date
     * @return String
     */
    public static String GetStringDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String Stringdate = dateFormat.format(date);
        return Stringdate;
    }

    public static Date GetDate(String date) {
        Date d = new Date(date);

        return d;
    }

}
