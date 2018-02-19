/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.Student;
import DAO.SelectAttendanceStudentData;

/**
 *
 * @author Chazool
 */
public class Check {

    public static boolean AttendantsValidation(String Index) {

        Student std = SelectAttendanceStudentData.selectData(Index);
        boolean bool = false;
        if (std.getIndex() != null) {
            bool = true;
        }

        return bool;
    }
}
