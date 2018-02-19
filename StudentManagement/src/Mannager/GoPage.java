/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import GUI.GUIHome;
import GUI.GUIStudentRegistation;
import GUI.GUITimeTable;
import javax.swing.JFrame;

/**
 *
 * @author Chazool
 */
public class GoPage {

    public GoPage(String GUI) {
          JFrame frame = null;

        switch (GUI) {
            case "home":
                new GUIHome().setVisible(true);
                break;
            case "StudentRegistation":
                new GUIStudentRegistation().setVisible(true);
                break;
            case "TimeTable":
                new GUITimeTable().setVisible(true);
                break;
        }
    }
    
    

    public static void CreateObject(String GUI) {

        JFrame frame = null;

        switch (GUI) {
            case "home":
                new GUIHome().setVisible(true);
                break;
            case "StudentRegistation":
                new GUIStudentRegistation().setVisible(true);
                break;
            case "TimeTable":
                new GUITimeTable().setVisible(true);
                break;
        }

    }

}
