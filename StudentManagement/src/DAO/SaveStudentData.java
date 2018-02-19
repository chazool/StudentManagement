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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

;

/**
 *
 * @author PCPAL
 */
public class SaveStudentData {

    public static boolean SaveData() {

        String SqlStudentData = "INSERT INTO student_info(id, fname, mname, sname, nic, birthday, gender, address, phonehome, phonemobile, email, image, ClassPlace, Bagdeyear) VALUES ('ChazoolIndex', 'gwen', 'shashiprabah', 'gaupadee', '546646446', 'ss', 'F', 'Tangalleeee', '564666464', '564666', 'gau@gail', '', 'Item 2', '2014');";

        String SqlOlData = "INSERT INTO ol_result(index1, index2, science, English, history, mathematic, sinhala, religion, SubjectName1, Subject1Result, SubjectName2, Subject2Result, SubjectName3, Subject3Result, Olyear1, olyear2, fkid) VALUES ('Y2500', '353633', 'A', 'A', 'A', 'A', 'A', 'A', 'Entrepreneurship Studies', 'B', 'Music (Carnatic)', 'C', ' Design & Technology ', 'B', '2019', '2020', 'ChazoolIndex');";

        String SqlParentData = "INSERT INTO parent_info (fname, lname, phone, relationship, fkid, NIC) VALUES ('Asrudeen', 'priyantha', '888888888', 'Father', 'ChazoolIndex', '6666555');";

        Connection con = DBConnection.getconnection();

        try {
            con.setAutoCommit(false);

            PreparedStatement StStudent = con.prepareStatement(SqlStudentData);
            StStudent.executeUpdate();

            PreparedStatement StOL = con.prepareStatement(SqlOlData);
            StOL.executeUpdate();

            PreparedStatement StParent = con.prepareStatement(SqlParentData);
            StParent.executeUpdate();

            con.commit();

            System.out.println("Suuuuuuuuuuu");

        } catch (SQLException ex) {
            Logger.getLogger(SaveStudentData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
