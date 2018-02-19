/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chazool
 */
public class SelectUserData {

    /**
     * Selected User Imformation
     *
     * @param username
     * @return
     */
    public static User selectdata(String username) {

        String sql = "SELECT username, pass, userrole FROM users WHERE username=?";

        // Get Connection 
        Connection con = DBConnection.getconnection();

        User usr = new User();
        PreparedStatement st;

        try {
            st = con.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            // get user Result
            if (rs.next()) {

                usr.setUserName(rs.getString(1));
                usr.setPassword(rs.getString("pass"));
                usr.setUserRole(rs.getString("userrole"));

            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SelectUserData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usr;
    }
}
