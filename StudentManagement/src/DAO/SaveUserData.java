/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.User;
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
public class SaveUserData {

    public static boolean savedata(User userData) {

        String sql = "INSERT INTO users(UserName, pass, userRole, createDate, createdUser) VALUES (?,?,?,CURDATE(),?);";

        // Get Connection 
        Connection mycon = DBConnection.getconnection();
        boolean bool = true;
        PreparedStatement st;
        try {
            st = mycon.prepareStatement(sql);

            st.setString(1, userData.getUserName());
            st.setString(2, userData.getPassword());
            st.setString(3, userData.getUserRole());
            //  st.setString(4, "CURDATE()");
            st.setString(4, userData.getCreateUser());

            bool = st.execute();
            st.close();
            mycon.close();

        } catch (Exception ex) {
            Logger.getLogger(SaveUserData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }

}
