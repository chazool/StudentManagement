/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.ClassPlace;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chazool
 */
public class SaveClassPlace {

    public static boolean getData(ClassPlace c) {

        String sql = "Insert InTo classplace(Place, CreateDate) Values (?,?)";
        boolean bool = true;
        Connection con = DB.DBConnection.getconnection();
        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);

            st.setString(1, c.getPlace());
            st.setString(2, c.getCretaeDate());

            bool = st.execute();
            st.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SaveClassPlace.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }
}
