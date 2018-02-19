/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PCPAL
 */
public class GetAutoIncrementNo {

    /**
     * Create Auto Increment No, Set Value String , student,paper |
     *
     * @param value
     * @return
     */
    public static int no(String value) {
        int key = 0;
        String sql = "";
        switch (value) {
            case "student":
                sql = "INSERT INTO student.auto_increment_no (iddata) VALUES ('');";
                break;
            case "paper":
                sql = "INSERT INTO papernoautoincrement (iddata) VALUES ('');";
                break;
        }

        Connection con = DBConnection.getconnection();

        try {

            Statement st = con.createStatement();

            st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                key = rs.getInt(1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(GetAutoIncrementNo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return key;
    }

}
