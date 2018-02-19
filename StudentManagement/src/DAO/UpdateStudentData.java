/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Student;
import DB.DBConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chazool
 */
public class UpdateStudentData {
    // String fname, String mname, String sname, String nic, String birthday, String gender, String address, String phonehome, String phonemobile, String email, String image, String ClassPlace, String Bagdeyear, String index1, String index2, String science, String English, String history, String mathematic, String sinhala, String religion, String SubjectName1, String Subject1Result, String SubjectName2, String Subject2Result, String SubjectName3, String Subject3Result, String Olyear1, String olyear2,

    public static boolean setdata(Student std) {

        String sql = "UPDATE student_info,parent_info,ol_result SET student_info.fname=?, student_info.mname=?, student_info.sname=?, student_info.nic=?, student_info.birthday=?, student_info.gender=?, student_info.address=?, student_info.phonehome=?, student_info.phonemobile=?, student_info.email=?, student_info.image=?, student_info.ClassPlace=?, student_info.Bagdeyear=? , ol_result.index1=?, ol_result.index2=?, ol_result.science=?, ol_result.English=?, ol_result.history=?, ol_result.mathematic=?, ol_result.sinhala=?, ol_result.religion=?, ol_result.SubjectName1=?, ol_result.Subject1Result=?, ol_result.SubjectName2=?, ol_result.Subject2Result=?, ol_result.SubjectName3=?, ol_result.Subject3Result=?, ol_result.Olyear1=?, ol_result.olyear2=? ,parent_info.fname=?, parent_info.lname=?, parent_info.phone=?, parent_info.relationship=?, parent_info.NIC=? WHERE student_info.id=parent_info.fkid and student_info.id=ol_result.fkid and student_info.id='" + std.getIndex() + "'";

// Get DB Connection 
        Connection con = DBConnection.getconnection();
        boolean bool = true;

        PreparedStatement st;
        try {
            st = con.prepareStatement(sql);

            // Student Infomation 
            st.setString(1, std.getFname());
            st.setString(2, std.getMname());
            st.setString(3, std.getSname());
            st.setString(4, std.getNic());
            st.setString(5, std.getDob());
            st.setString(6, std.getGender());
            st.setString(7, std.getAddress());
            st.setString(8, std.getPhonehome());
            st.setString(9, std.getPhonemobile());
            st.setString(10, std.getEmail());
            st.setBinaryStream(11, (InputStream)new FileInputStream(new File(std.getImagepath())),std.getImagepath().length());
            st.setString(12, std.getClassplasse());
            st.setString(13, std.getBadgeYear());

            // OL Information
            st.setString(14, std.getOLIndex1());
            st.setString(15, std.getOLIndex2());
            st.setString(16, std.getScience());
            st.setString(17, std.getEnglish());
            st.setString(18, std.getHistory());
            st.setString(19, std.getMaths());
            st.setString(20, std.getSinhala());
            st.setString(21, std.getReligion());
            st.setString(22, std.getSubject1());
            st.setString(23, std.getSubject1result());
            st.setString(24, std.getSubject2());
            st.setString(25, std.getSubject2result());
            st.setString(26, std.getSubject3());
            st.setString(27, std.getSubject3result());
            st.setString(28, std.getOL1stYear());
            st.setString(29, std.getOL2ndYear());

            // Perant Iformation 
            st.setString(30, std.getPfname());
            st.setString(31, std.getPlname());
            st.setString(32, std.getPphone());
            st.setString(33, std.getPrelationship());
            st.setString(34, std.getPnic());

            bool = st.execute();
            st.close();
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(UpdateStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bool;
    }
}
