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
 * @author PCPAL
 */
public class SelectStudentData {

    public static Student selectdata(String search) {

        String sql = "SELECT * FROM student_info INNER JOIN ol_result ON student_info.id=ol_result.fkid INNER JOIN parent_info on student_info.id =parent_info.fkid where student_info.id='" + search + "'";

        // get Connection 
        Connection con = DBConnection.getconnection();

        Student student = new Student();

        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);

            // Get Student Data
            ResultSet rs = st.executeQuery();
            if (rs.next()) {

                // Student Object 
                student.setFname(rs.getString(2));
                student.setMname(rs.getString(3));
                student.setSname(rs.getString(4));
                student.setNic(rs.getString(5));
                student.setDob(rs.getString(6));
                student.setGender(rs.getString(7).trim());
                student.setAddress(rs.getString(8));
                student.setPhonehome(rs.getString(9));
                student.setPhonemobile(rs.getString(10));
                student.setEmail(rs.getString(11));

                // Convate the Image 
                InputStream image = rs.getBinaryStream(12);

                student.setClassplasse(rs.getString(13));
                student.setBadgeYear(rs.getString(14));
                // Set OL Result 
                student.setOLIndex1(rs.getString(15));
                student.setOLIndex2(rs.getString(16));
                student.setScience(rs.getString(17));
                student.setEnglish(rs.getString(18));
                student.setHistory(rs.getString(19));
                student.setMaths(rs.getString(20));
                student.setSinhala(rs.getString(21));
                student.setReligion(rs.getString(22));
                student.setSubject1(rs.getString(23));
                student.setSubject1result(rs.getString(24));
                student.setSubject2(rs.getString(25));
                student.setSubject2result(rs.getString(26));
                student.setSubject3(rs.getString(27).trim());
                student.setSubject3result(rs.getString(28));
                student.setOL1stYear(rs.getString(29).trim());
                student.setOL2ndYear(rs.getString(30));

                // Set Parent Data
                student.setPfname(rs.getString(32));
                student.setPlname(rs.getString(33));
                student.setPphone(rs.getString(34));
                student.setPrelationship(rs.getString(35).trim());
                student.setPnic(rs.getString(38));
                
                
                System.out.println(rs.getString(35));

                student.setImagepath("");

                st.close();
                rs.close();
                con.close();

            }

        } catch (Exception ex) {
            Logger.getLogger(SelectStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return student;
    }
}
