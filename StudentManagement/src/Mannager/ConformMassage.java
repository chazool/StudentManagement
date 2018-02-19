/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import javax.swing.JOptionPane;

/**
 *
 * @author PCPAL
 */
public class ConformMassage {

    /**
     *
     * Set text ,Show Option (Yes Or No) Massage
     *
     * @param Text
     * @return int
     */
    public static int AnswerMassage(String Text) {

        String Msg = "Are You Sure " + Text + "?";
        int MsgInt = JOptionPane.showConfirmDialog(null, Msg, "Confirm Details ", JOptionPane.YES_NO_OPTION);

        return MsgInt;
    }

    public static void SuccsessMassage(String Text) {
        String Msg = Text + " " + "Succsess";
        JOptionPane.showConfirmDialog(null, Msg, "Massage", JOptionPane.PLAIN_MESSAGE);

    }
}
