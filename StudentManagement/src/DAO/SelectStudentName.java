/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
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
 * @author PCPAL
 */
public class SelectStudentName {

    public static ArrayList<Student> getdata(String name, String badge, String classplace, String index) {
        String sql;
        if (name != null) {
            sql = "SELECT * FROM student.Student_info WHERE fname LIKE '%" + name + "%' or  mname LIKE '%" + name + "%'or  sname LIKE '%" + name + "%'";

        } else if (badge != null) {

            sql = "SELECT * FROM student.Student_info WHERE Bagdeyear LIKE '%" + badge + "%' ";

        } else if (classplace != null) {
            sql = "SELECT * FROM student.Student_info WHERE ClassPlace LIKE '%" + classplace + "%' ";
        } else {
            sql = "SELECT * FROM student.Student_info WHERE id= '" + index + "' ";
        }

        // get Database Connection
        DBConnection db = new DBConnection();
        Connection con = db.getconnection();
        ArrayList<Student> lst = new ArrayList();
        try {

            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Student std = new Student();
                std.setIndex(rs.getString(1));
                std.setFname(rs.getString(2));
                std.setMname(rs.getString(3));
                std.setSname(rs.getString(4));
                std.setNic(rs.getString(5));
                std.setDob(rs.getString(6));
                std.setGender(rs.getString(7));
                std.setAddress(rs.getString(8));
                std.setPhonehome(rs.getString(9));
                std.setPhonemobile(rs.getString(10));
                std.setEmail(rs.getString(11));
                //  std.setImagepath(rs.getBinaryStream(12).toString());

                lst.add(std);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectStudentName.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;
    }
}
