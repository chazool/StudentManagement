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
 * @author Chazool
 */
public class DeleteTimeTable {

    public static boolean GetData(TimeTable time) {

        String sql = "Delete From timetable Where Date=? and StartTime=? and EndTime=?;";

        Connection con = DBConnection.getconnection();
        boolean bool = true;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, time.getDate());
            st.setString(2, time.getStartTime());
            st.setString(3, time.getEndTime());

            bool = st.execute();
        } catch (Exception ex) {
            Logger.getLogger(DeleteTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
