/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import Bean.Attendants;
import Bean.Batch;
import Bean.ClassPlace;
import DAO.SaveAttendants;

import Bean.TimeTable;
import Bean.User;
import DAO.SaveBatch;
import DAO.SaveClassPlace;
import java.util.ArrayList;
import DAO.SaveTimeTable;
import DAO.SaveUserData;
import DAO.SelectAttendanceStudentData;
import DAO.SelectTimeTable;
import GUI.GUIEditTimeTable;
import GUI.GUITimeTable;
import java.util.Date;

/**
 *
 * @author Chazool
 */
public class Save {

    /**
     * Save Class Place
     *
     * @param Place
     * @return
     */
    public static String ClassPlace(String Place) {
        String Text = "Class Place", Ret = null;

        switch (ConformMassage.AnswerMassage(Text)) {
            case 0:
                ClassPlace cp = new ClassPlace();

                cp.setPlace(Place);
                cp.setCretaeDate(new DateTime().Today);
                if (!SaveClassPlace.getData(cp)) {
                    ConformMassage.SuccsessMassage(Text);
                }
                break;
            default:
                Ret = Place;
                break;
        }
        return Ret;
    }

    /**
     * Save Batch
     *
     * @param year
     * @param StartDate
     * @param Place
     */
    public static void Batch(int year, Date StartDate, String Place) {
        String Text = "Batch ", Ret = null;
        switch (ConformMassage.AnswerMassage(Text)) {
            case 0:
                Batch b = new Batch();
                b.setClassBatch(Integer.toString(year));
                b.setStarDate(DateTime.GetStringDate(StartDate));
                b.setClassplace(Place);
                if (!SaveBatch.setdata(b)) {
                    ConformMassage.SuccsessMassage(Text);

                }
                break;
            default:

                break;
        }

    }

    /**
     * Save Time Table
     *
     * @param Date
     * @param StartTime
     * @param EndTime
     * @param ClassPlace
     * @param Batch
     */
    public static boolean TimeTable(String Date, String StartTime, String EndTime, String ClassPlace, String Batch, String ClassType) {
        boolean bool = false;
        if (ConformMassage.AnswerMassage("Nus") == 0) {
            TimeTable Time = new TimeTable();

            Time.setDate(Date);
            Time.setStartTime(StartTime);
            Time.setEndTime(EndTime);
            Time.setClassPlace(ClassPlace);
            Time.setBatch(Batch);
            Time.setClassType(ClassType);

            if (!SaveTimeTable.gettimetable(Time)) {
                ConformMassage.SuccsessMassage("Shedule");
                bool = true;
            }
        }

        return bool;
    }

    /**
     * Save Student Attendents
     *
     * @param Index
     * @param SlecItemIndex
     * @return Boolean
     */
    public static Boolean SaveStudentAttend(String Index, int SlecItemIndex) {

        boolean bool;
        if (Check.AttendantsValidation(Index)) {
            bool = true;

            //Save Studet Attendets 
            ArrayList<TimeTable> list = SelectTimeTable.selectdata(new DateTime().DateString);

            Attendants atnd = new Attendants();

            atnd.setIndex(Index);
            atnd.setToday(new DateTime().Today);
            atnd.setTistime(new DateTime().ThisTime);
            atnd.setClassdate(new DateTime().DateString);
            atnd.setClassStartTime(list.get(SlecItemIndex).getStartTime());

            SaveAttendants.getdata(atnd);

            // Get Student Data
            SelectAttendanceStudentData.selectData(Index);

        } else {
            bool = false;

        }

        return bool;
    }

    /**
     * User Registration
     *
     * @param username
     * @param password
     * @param createUser
     * @param userrole
     * @return boolean
     */
    public static boolean User(String username, String password, String createUser, String userrole) {
        int msg = ConformMassage.AnswerMassage("Do You Register This User.?");
        boolean bool = false;
        if (msg == 0) {
            User user = new User();
            user.setUserName(username);
            user.setPassword(password);
            user.setUserRole(userrole);
            user.setCreateUser(createUser);

            if (!SaveUserData.savedata(user)) {
                ConformMassage.SuccsessMassage("Successful User Registration");
                bool = true;

            }
        }
        return bool;
    }
}
