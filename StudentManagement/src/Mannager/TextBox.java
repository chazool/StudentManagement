/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.TimeTable;
import DAO.SelectTimeTable;
import java.util.ArrayList;

/**
 *
 * @author Chazool
 */
public class TextBox {

    /**
     * Use the Attendant sheet , Display select the class time then display the
     * shedule
     *
     * @param index
     * @return
     */
    public static String displyashedule(int index) {
        ArrayList<TimeTable> list = SelectTimeTable.selectdata(new DateTime().DateString);

        String ClassDate = list.get(index).getDate();
        String StartTime = list.get(index).getStartTime();
        String endTime = list.get(index).getEndTime();
        String Classplace = list.get(index).getClassPlace();
        String badgeyear = list.get(index).getBatch();

        String DisplayMsg = badgeyear + "\n" + StartTime + " " + "To" + " " + endTime + "\n" + Classplace;

        return DisplayMsg;
    }

    /**
     * show Time Table to 7 Days
     *
     * @return String[]
     */
    public static String[] ShowTimeTable() {

        ArrayList<TimeTable> list = SelectTimeTable.selectdata(null);

        String date, mondy = "", tuedy = "", weddy = "", thudy = "", fridy = "", satdy = "", sundy = "";
        for (TimeTable list1 : list) {
            date = list1.getDate();
            String shedule = list1.getStartTime() + " To " + list1.getEndTime() + "\n" + list1.getBatch() + "-" + list1.getClassType() + "\n" + list1.getClassPlace() + "\n" + "------------------------------------" + "\n";

            switch (date) {
                case "Monday":
                    mondy = mondy + shedule;
                    break;
                case "Tuesday":
                    tuedy = tuedy + shedule;
                    break;
                case "Wednesday":
                    weddy = weddy + shedule;
                    break;
                case "Thursday":
                    thudy = thudy + shedule;
                    break;
                case "Friday":
                    fridy = fridy + shedule;
                    break;
                case "Saturday":
                    satdy = satdy + shedule;
                    break;
                case "Sunday":
                    sundy = sundy + shedule;
                    break;
            }

        }

        String array[] = {mondy, tuedy, weddy, thudy, fridy, satdy, sundy};

        return array;
    }
}
