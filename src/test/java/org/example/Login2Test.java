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

public class Login2Test {

    @Test
    public void testLoginButtonProperties() {
        Login2 login2 = new Login2();
        JButton loginButton = login2.b1;

        assertNotNull(loginButton);
        assertEquals("Login", loginButton.getText());
        assertEquals(new Font("serif", Font.BOLD, 15), loginButton.getFont());
        assertEquals(Color.BLACK, loginButton.getBackground());
        assertEquals(Color.white, loginButton.getForeground());
    }

    @Test
    public void testCancelButtonProperties() {
        Login2 login2 = new Login2();
        JButton cancelButton = login2.b2;

        assertNotNull(cancelButton);
        assertEquals("Cancel", cancelButton.getText());
        assertEquals(new Font("serif", Font.BOLD, 15), cancelButton.getFont());
        assertEquals(Color.BLACK, cancelButton.getBackground());
        assertEquals(Color.white, cancelButton.getForeground());
    }

    @Test
    public void testUsernameTextFieldProperties() {
        Login2 login2 = new Login2();
        JTextField usernameTextField = login2.textField1;

        assertNotNull(usernameTextField);
        assertEquals(new Font("Tahoma", Font.PLAIN, 15), usernameTextField.getFont());
        assertEquals(Color.WHITE, usernameTextField.getForeground());
        assertEquals(new Color(26, 104, 110), usernameTextField.getBackground());
    }

    @Test
    public void testPasswordFieldProperties() {
        Login2 login2 = new Login2();
        JPasswordField passwordField = login2.passwordField1;

        assertNotNull(passwordField);
        assertEquals(new Font("Tahoma", Font.PLAIN, 15), passwordField.getFont());
        assertEquals(Color.WHITE, passwordField.getForeground());
        assertEquals(new Color(26, 104, 110), passwordField.getBackground());
    }

    @Test
    public void testActionPerformed() {
        Login2 login2 = new Login2();

        // Test login button action
        login2.textField1.setText("admin");
        login2.passwordField1.setText("admin");
        login2.b1.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));

        // Assuming the login credentials are valid, the admin dashboard should be visible
        assertFalse(login2.isVisible());

        // Test cancel button action
        login2.b2.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        assertFalse(login2.isVisible());
    }
}
