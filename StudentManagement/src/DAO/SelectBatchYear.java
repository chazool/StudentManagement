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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chazool
 */
public class SelectBatchYear {

    public static ArrayList<String> getYear(String Classplace) {

        String sql = "SELECT ClassBatch,ClassPlace FROM studentbatch where ClassPlace=? ;";

        ArrayList<String> list = new ArrayList();
        list.add(" ");
        Connection con = DBConnection.getconnection();
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            st.setString(1, Classplace);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                list.add(rs.getString(1));
            }

        } catch (Exception ex) {
            Logger.getLogger(SelectBatchYear.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
