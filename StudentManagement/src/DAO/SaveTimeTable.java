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
public class SaveTimeTable {

    public static boolean gettimetable(TimeTable data) {

        String sql = "INSERT INTO timetable(Date, StartTime, EndTime, ClassPlace, Batch, ClassType) VALUES (?,?,?,?,?,?);";

        Connection con = DBConnection.getconnection();
        boolean bool = true;
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            st.setString(1, data.getDate());
            st.setString(2, data.getStartTime());
            st.setString(3, data.getEndTime());
            st.setString(4, data.getClassPlace());
            st.setString(5, data.getBatch());
            st.setString(6, data.getClassType());

            bool = st.execute();

            st.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SaveTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
