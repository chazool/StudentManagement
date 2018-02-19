/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class DeleteBatchYear {

    public static boolean getdat(String ClassBatch, String ClassPlace) {
        String sql = "Delete From studentbatch Where ClassBatch=? and ClassPlace=?";
        boolean bool = true;

        Connection con = DBConnection.getconnection();
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);

            st.setString(1, ClassBatch);
            st.setString(2, ClassPlace);

            bool = st.execute();
            st.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(DeleteBatchYear.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
