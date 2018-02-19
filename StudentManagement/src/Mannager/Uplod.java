/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Chazool
 */
public class Uplod {

    public static String Imagepath;

    public static Icon ImageIcon(int width, int hight) {

        File file = fileCooser();
        Icon icon = null;

        try {
            if (file != null) {
                Imagepath = file.getAbsolutePath();
                Image im = ImageIO.read(file);
                Image resize = im.getScaledInstance(width, hight, 0);
                icon = new ImageIcon(resize);
            }

        } catch (Exception ex) {
        }

        return icon;
    }

    private static File fileCooser() {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);

        File file = chooser.getSelectedFile();

        return file;
    }

    public static FileInputStream SetInputsteem(String Imagepath) {
        FileInputStream inputsteem = null;
        if (Imagepath.length() >= 1) {

            File path = new File(Imagepath);
            try {
                inputsteem = new FileInputStream(new File(Imagepath));
            } catch (Exception ex) {
                Logger.getLogger(Uplod.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            inputsteem = null;
        }

        return inputsteem;
    }
}
