/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mannager;

/**
 *
 * @author Chazool
 */
public class TextBoxValidation {

    /**
     * Use To String Text Box Validation - Consume Numbers , Symbol and Spaces
     *
     * @param evt
     */
    public static void KeyType(java.awt.event.KeyEvent evt) {
        char key = evt.getKeyChar();
        String s = key + "";
        if (Character.isDigit(key) || !s.matches("[a-zA-Z]")) {
            evt.consume();
        }
    }

    /**
     * Use To Integer Text Box Validation - Consume String and String length < 9
     *
     * @param evt
     * @param length
     */
    public static void KeyType(java.awt.event.KeyEvent evt, int length) {
        char key = evt.getKeyChar();
        if (!Character.isDigit(key) || length == 9) {
            evt.consume();
        }
    }

    /**
     * Use To Phone Number Validation
     *
     * @param evt
     * @param Text
     */
    public static void KeyType(java.awt.event.KeyEvent evt, String Text) {
        char key = evt.getKeyChar();
        if (!Character.isDigit(key)) {
            evt.consume();
        } else {
            if (Text.length() == 9) {
                String s = Text.charAt(0) + "";
                if (!s.equals("0")) {
                    evt.consume();
                }
            } else if (Text.length() == 10) {
                evt.consume();
            }
        }
    }

}
