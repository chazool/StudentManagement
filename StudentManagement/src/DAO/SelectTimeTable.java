/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.TimeTable;
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
public class SelectTimeTable {
    
    public static ArrayList<TimeTable> selectdata(String Date) {
        String sql;
        if (Date == null) {
            sql = "SELECT * FROM timetable ";
        } else {
            sql = "SELECT * FROM timetable Where date Like '" + Date + "%' ";
        }
        
        Connection con = DBConnection.getconnection();
        
        ArrayList<TimeTable> list = new ArrayList();
        
        try {
            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                TimeTable time = new TimeTable();
                time.setDate(rs.getString(1));
                time.setStartTime(rs.getString(2));
                time.setEndTime(rs.getString(3));
                time.setClassPlace(rs.getString(4));
                time.setBatch(rs.getString(5));
                time.setClassType(rs.getString(6));
                list.add(time);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(SelectTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
