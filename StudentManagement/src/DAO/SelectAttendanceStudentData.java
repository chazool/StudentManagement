/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import DB.DBConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chazool
 */
public class SelectAttendanceStudentData {

    public static Student selectData(String index) {

        String sql = "SELECT fname, mname, sname,  gender, image, ClassPlace, Bagdeyear,id FROM student_info WHERE id='" + index + "';";

        Connection con = DBConnection.getconnection();

        Student std = new Student();

        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                String image = rs.getString(5);

                std.setFname(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                std.setImage((InputStream)rs.getBinaryStream("image"));
                std.setGender(rs.getString(4));
                std.setClassplasse(rs.getString(6));
                std.setBadgeYear(rs.getString(7));
                std.setIndex(rs.getString(8));

            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SelectAttendanceStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return std;
    }

}
