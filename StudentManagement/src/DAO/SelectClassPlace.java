/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class SelectClassPlace {

    public static ArrayList<String> GetPlace() {

        String sql = "SELECT Place From classplace;";
        ArrayList<String> list = new ArrayList();
        list.add(" ");

        Connection con = DB.DBConnection.getconnection();

        try {
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                list.add(rs.getString("Place"));

            }
           

        } catch (Exception ex) {
            Logger.getLogger(SelectClassPlace.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
