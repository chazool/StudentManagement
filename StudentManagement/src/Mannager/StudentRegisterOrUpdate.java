/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.Student;
import DAO.SaveStudentData;
import DAO.UpdateStudentData;
import static GUI.GUIStudentRegistation.RegOrUp;
import javax.swing.JOptionPane;

/**
 *
 * @author PCPAL
 */
public class StudentRegisterOrUpdate {
/**
 * Use to the Student Registation and Update, Set Student Type Data
 * @param std 
 */
    public static void SetData(Student std) {

        int msg = JOptionPane.showConfirmDialog(null, "Are You Sure That Your Details Are Right.?", "Confirm Details ", JOptionPane.YES_NO_OPTION);
        boolean bool = true;
        String Msg = "";
        if (msg == 0) {
            if (RegOrUp == 1) {
                bool = SaveStudentData.SaveData(std);
                Msg = "Updating Success \n";
            } else if (RegOrUp == 2) {
                bool = UpdateStudentData.setdata(std);
                Msg = "Registtation Success \n";
            }
        }

        Msg = Msg + std.getIndex() + " - " + std.getFname();

        if (!bool) {
            JOptionPane.showConfirmDialog(null, Msg, "Massage", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
