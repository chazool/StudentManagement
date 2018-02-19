/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Batch;
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
public class SaveBatch {

    public static boolean setdata(Batch b) {

        String sql = "Insert Into studentbatch(ClassBatch, StartDate, ClassPlace) Values(?,?,?);";
        Connection con = DBConnection.getconnection();
        boolean bool = true;
        PreparedStatement st;
        try {

            st = con.prepareStatement(sql);

            st.setString(1,b.getClassBatch());
            st.setString(2, b.getStarDate());
            st.setString(3, b.getClassplace());

            bool = st.execute();
            st.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(SaveBatch.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
