package org.example;

import org.junit.jupiter.api.Test;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testLoginButtonProperties() {
        Login login = new Login();
        JButton loginButton = login.btn_login;

        assertNotNull(loginButton);
        assertEquals("Login", loginButton.getText());
        assertEquals(new Font("serif", Font.BOLD, 15), loginButton.getFont());
        assertEquals(Color.BLACK, loginButton.getBackground());
        assertEquals(Color.white, loginButton.getForeground());
    }

    @Test
    public void testCancelButtonProperties() {
        Login login = new Login();
        JButton cancelButton = login.btn_cancel;

        assertNotNull(cancelButton);
        assertEquals("Cancel", cancelButton.getText());
        assertEquals(new Font("serif", Font.BOLD, 15), cancelButton.getFont());
        assertEquals(Color.BLACK, cancelButton.getBackground());
        assertEquals(Color.white, cancelButton.getForeground());
    }

    @Test
    public void testUsernameTextFieldProperties() {
        Login login = new Login();
        JTextField usernameTextField = login.jtf_usename;

        assertNotNull(usernameTextField);
        assertEquals(new Font("Tahoma", Font.PLAIN, 15), usernameTextField.getFont());
        assertEquals(Color.WHITE, usernameTextField.getForeground());
        assertEquals(new Color(26, 104, 110), usernameTextField.getBackground());
    }

    @Test
    public void testPasswordFieldProperties() {
        Login login = new Login();
        JPasswordField passwordField = login.passwordField;

        assertNotNull(passwordField);
        assertEquals(new Font("Tahoma", Font.PLAIN, 15), passwordField.getFont());
        assertEquals(Color.WHITE, passwordField.getForeground());
        assertEquals(new Color(26, 104, 110), passwordField.getBackground());
    }

    @Test
    public void testActionPerformed() {
        Login login = new Login();

        // Test login button action
        login.jtf_usename.setText("admin");
        login.passwordField.setText("admin");
        login.btn_login.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));

        // Assuming the login credentials are valid, the dashboard should be visible
        assertFalse(login.isVisible());

        // Test cancel button action
        login.btn_cancel.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        assertFalse(login.isVisible());
    }
}
