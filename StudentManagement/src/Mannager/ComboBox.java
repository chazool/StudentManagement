/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.TimeTable;
import DAO.SelectBatchYear;
import DAO.SelectClassPlace;
import DAO.SelectTimeTable;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Chazool
 */
public class ComboBox {

    public static DefaultComboBoxModel SetBatchyear(String ClassPlace) {

        ArrayList<String> list = SelectBatchYear.getYear(ClassPlace);

        DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel(list.toArray(new String[]{}));
        return model;

    }

    public static DefaultComboBoxModel SetClassPlace() {

        ArrayList<String> list = SelectClassPlace.GetPlace();

        DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel(list.toArray(new String[]{}));
        return model;

    }

    public static DefaultComboBoxModel SetAttendenceTimeTableShedule() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (TimeTable list1 : SelectTimeTable.selectdata(new DateTime().DateString)) {
            model.addElement(list1.getClassPlace() + " " + list1.getBatch());
        }

        return model;
    }

}
