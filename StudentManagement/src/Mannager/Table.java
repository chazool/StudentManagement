/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.Student;
import Bean.TimeTable;
import DAO.SelectStudentName;
import DAO.SelectTimeTable;
import GUI.GUISearch;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chazool
 */
public class Table {

    /**
     * Get Time Table
     *
     * @param Date
     * @return
     */
    public static DefaultTableModel SetTimeTable(String Date) {

        DefaultTableModel model = new javax.swing.table.DefaultTableModel(new String[][]{},
                new String[]{"Date", "Start Time", "End Time", "Class Place", "Batch", "Class Type"});

        ArrayList<TimeTable> list = SelectTimeTable.selectdata(Date);

        //Model Set New Raw
        for (TimeTable list1 : list) {

            model.addRow(new Object[]{list1.getDate(), list1.getStartTime(),
                list1.getEndTime(), list1.getClassPlace(), list1.getBatch()});
        }
        return model;
    }

    /**
     * Get Student Deatails
     *
     * @param SeachText
     * @param SeachType
     * @return DefaultTableModel
     */
    public static DefaultTableModel SelectTimeTable(String SearchText, String SeachType) {
        // Table model
        DefaultTableModel model = new javax.swing.table.DefaultTableModel(new String[][]{},
                new String[]{"Index", "First Name", "Middle Name", "Last Name", "NIC", "DOB", "Gender", "Phone Home", "Phone Mobile", "email", "image"});

        // 
        // Get DB Value
        ArrayList<Student> student = null;

        if (null != SeachType) {
            String msg = "";
            switch (SeachType) {
                case "Index":
                    if (Check.AttendantsValidation(SearchText)) {
                        student = SelectStudentName.getdata(null, null, null, SearchText);
                    } else {
                        msg = "Invalid Index";
                    }
                    break;
                case "Name":
                    student = SelectStudentName.getdata(SearchText, null, null, null);
                    break;
                case "Badge":
                    student = SelectStudentName.getdata(null, SearchText, null, null);
                    break;
                case "Class Place":
                    student = SelectStudentName.getdata(null, null, SearchText, null);
                    break;
            }
            GUISearch.Massage = msg;
        }

        //Set Table Value **************
        if (student != null) {

            model.setRowCount(0);
            for (Student student1 : student) {
                String index = student1.getIndex();
                String fname = student1.getFname();
                String mname = student1.getMname();
                String sname = student1.getSname();
                String nic = student1.getNic();
                String dob = student1.getDob();
                String address = student1.getAddress();
                String phonehome = student1.getPhonehome();
                String phonemobile = student1.getPhonemobile();
                String email = student1.getEmail();
                //   String getimagepath = student.getImagepath();
                model.addRow(new Object[]{index, fname, mname, sname, nic, dob, address, phonehome, phonemobile, email, null});
            }
        }
        return model;
    }
}
