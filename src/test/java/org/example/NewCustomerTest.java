package org.example;

import org.junit.jupiter.api.Test;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;

public class NewCustomerTest {

    @Test
    public void testAddButtonProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JButton addButton = newCustomer.add;

        assertNotNull(addButton);
        assertEquals("ADD", addButton.getText());
        assertEquals(new Font("Tahoma", Font.BOLD, 14), addButton.getFont());
        assertEquals(Color.BLACK, addButton.getBackground());
        assertEquals(Color.white, addButton.getForeground());
    }

    @Test
    public void testBackButtonProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JButton backButton = newCustomer.back;

        assertNotNull(backButton);
        assertEquals("BACK", backButton.getText());
        assertEquals(new Font("Tahoma", Font.BOLD, 14), backButton.getFont());
        assertEquals(Color.BLACK, backButton.getBackground());
        assertEquals(Color.white, backButton.getForeground());
    }

    @Test
    public void testComboBoxProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JComboBox<String> comboBox = newCustomer.comboBox;

        assertNotNull(comboBox);
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), comboBox.getFont());
        assertEquals(Color.WHITE, comboBox.getForeground());
        assertEquals(new Color(3, 45, 48), comboBox.getBackground());
    }

    @Test
    public void testTextFieldNumberProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JTextField textFieldNumber = newCustomer.textFieldNumber;

        assertNotNull(textFieldNumber);
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textFieldNumber.getFont());
    }

    @Test
    public void testTextNameProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JTextField textName = newCustomer.TextName;

        assertNotNull(textName);
    }

    @Test
    public void testTextCountryProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JTextField textCountry = newCustomer.TextCountry;

        assertNotNull(textCountry);
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textCountry.getFont());
    }

    @Test
    public void testTextDepositeProperties() {
        NewCustomer newCustomer = new NewCustomer();
        JTextField textDeposite = newCustomer.TextDeposite;

        assertNotNull(textDeposite);
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textDeposite.getFont());
    }

    @Test
    public void testActionPerformed() {
        NewCustomer newCustomer = new NewCustomer();

        // Test add button action
        newCustomer.textFieldNumber.setText("101");
        newCustomer.TextName.setText("John Doe");
        newCustomer.r1.setSelected(true); // Assume Male is selected
        newCustomer.TextCountry.setText("USA");
        newCustomer.c1.add("101");
        newCustomer.date.setText("2023-01-01");
        newCustomer.TextDeposite.setText("1000");
        newCustomer.add.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));

        // Assuming the add operation is successful, the form should be closed
        assertFalse(newCustomer.isVisible());

        // Test back button action
        NewCustomer newCustomer2 = new NewCustomer();
        newCustomer2.back.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
        assertFalse(newCustomer2.isVisible());
    }
}
