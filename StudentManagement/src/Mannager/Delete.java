/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.TimeTable;
import DAO.DeleteBatchYear;
import DAO.DeleteClassPlace;
import DAO.DeleteTimeTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chazool
 */
public class Delete {

    /**
     * Delete Class Place , Return ComboBox Model and Set The ClassPlace
     * ComboBox
     *
     * @param Place
     * @return DefaultComboBoxModel
     */
    public static DefaultComboBoxModel ClassPlace(String Place) {

        String Text = "Delete";
        switch (ConformMassage.AnswerMassage(Text)) {
            case 0:
                if (!DeleteClassPlace.SetData(Place)) {
                    ConformMassage.SuccsessMassage(Text);
                }
                break;
        }

        return ComboBox.SetClassPlace();

    }

    /**
     * Delete Batch , Return ComboBox Model and Set The Batch ComboBox
     *
     * @param Batch
     * @param ClasPlace
     * @return DefaultComboBoxModel
     */
    public static DefaultComboBoxModel Batch(String Batch, String ClasPlace) {

        String Text = "Batch";
        switch (ConformMassage.AnswerMassage(Text)) {
            case 0:
                if (!DeleteBatchYear.getdat(Batch, ClasPlace)) {
                    ConformMassage.SuccsessMassage(Text);
                }
                break;
        }

        return ComboBox.SetBatchyear(ClasPlace);

    }

    public static DefaultTableModel TimeTable(TimeTable time, DefaultTableModel TableModel, String Date) {
        DefaultTableModel model = TableModel;
        if (ConformMassage.AnswerMassage("Delete TimeTable") == 0) {
            String text;

            if (!DeleteTimeTable.GetData(time)) {
                text = "Time Table Deleting Sucsess";
                model = Table.SetTimeTable(Date);
            } else {
                text = "Unsuccsess Fully Deleting";
            }
            ConformMassage.SuccsessMassage(text);
        }

        return model;
    }

}
