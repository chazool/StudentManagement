/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.TimeTable;
import DAO.UpdateTimeTable;
import GUI.GUIEditTimeTable;

/**
 *
 * @author Chazool
 */
public class Update {

    public static void TimeTable(String Date, String StartTime, String EndTime, String ClassPlace, String Batch, String ClassType) {

        int msg = ConformMassage.AnswerMassage("sjjjjdjj");
        if (msg == 0) {
            TimeTable TTable = new TimeTable();
            TTable.setDate(Date);
            TTable.setStartTime(StartTime);
            TTable.setEndTime(EndTime);
            TTable.setClassPlace(ClassPlace);
            TTable.setBatch(Batch);
            TTable.setClassType(Batch);
            if (!UpdateTimeTable.updatetable(TTable, GUIEditTimeTable.primaryDate, GUIEditTimeTable.primaryStartTime, GUIEditTimeTable.primaryEndTime)) {
                ConformMassage.SuccsessMassage("Succses Fully Update");
                new GUIEditTimeTable().clear();

            }

        }

    }

}
