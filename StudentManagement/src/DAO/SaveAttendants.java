/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Attendants;
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
public class SaveAttendants {

    public static boolean getdata(Attendants atnd) {

        String sql = "INSERT INTO attendants(StdIndex, Today, ThisTime, ClassDate, ClassStartTime)values(?,?,?,?,?);";

        Connection con = DBConnection.getconnection();
        boolean bool = false;

        try {
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, atnd.getIndex());
            st.setString(2, atnd.getToday());
            st.setString(3, atnd.getTistime());
            st.setString(4, atnd.getClassdate());
            st.setString(5, atnd.getClassStartTime());

            bool = st.execute();
            st.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(SaveAttendants.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
