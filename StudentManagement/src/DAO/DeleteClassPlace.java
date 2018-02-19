/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCPAL
 */
public class DeleteClassPlace {

    public static boolean SetData(String place) {

        String sql = "Delete From classplace Where place=?;";
        boolean bool = true;

        Connection con = DB.DBConnection.getconnection();

        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, place);

            bool = st.execute();

        } catch (Exception ex) {
            Logger.getLogger(DeleteClassPlace.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
