/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.TimeTable;
import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCPAL
 */
public class UpdateTimeTable {

    /**
     * Update Time Table ,Set New Time Table Data
     *
     * @param Shedule
     * @param primayDate
     * @param PrimaryStartTime
     * @param PrimaryEndTime
     * @return
     */
    public static boolean updatetable(TimeTable Shedule, String primayDate, String PrimaryStartTime, String PrimaryEndTime) {

        String sql = "Update timetable SET Date=?, StartTime=?, EndTime=?, ClassPlace=?, Batch=?, ClassType=? where Date=? and StartTime=? and EndTime=? ;";

        Connection con = DBConnection.getconnection();

        boolean bool = true;

        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            st.setString(1, Shedule.getDate());
            st.setString(2, Shedule.getStartTime());
            st.setString(3, Shedule.getEndTime());
            st.setString(4, Shedule.getClassPlace());
            st.setString(5, Shedule.getBatch());
            st.setString(6, Shedule.getClassType());

            //set Primary Key
            st.setString(7, primayDate);
            st.setString(8, PrimaryStartTime);
            st.setString(9, PrimaryEndTime);

            bool = st.execute();

            st.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(UpdateTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
