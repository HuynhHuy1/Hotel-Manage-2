package org.example;

import org.junit.jupiter.api.Test;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;

public class UpdateRoomTest {

    @Test
    public void testUpdateButtonProperties() {
        UpdateRoom updateRoom = new UpdateRoom();
        JButton updateButton = updateRoom.update;

        assertNotNull(updateButton);
        assertEquals("Update", updateButton.getText());
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), updateButton.getFont());
        assertEquals(Color.BLACK, updateButton.getBackground());
        assertEquals(Color.WHITE, updateButton.getForeground());
    }

    @Test
    public void testBackButtonProperties() {
        UpdateRoom updateRoom = new UpdateRoom();
        JButton backButton = updateRoom.back;

        assertNotNull(backButton);
        assertEquals("Back", backButton.getText());
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), backButton.getFont());
        assertEquals(Color.BLACK, backButton.getBackground());
        assertEquals(Color.WHITE, backButton.getForeground());
    }

    @Test
    public void testCheckButtonProperties() {
        UpdateRoom updateRoom = new UpdateRoom();
        JButton checkButton = updateRoom.check;

        assertNotNull(checkButton);
        assertEquals("Check", checkButton.getText());
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), checkButton.getFont());
        assertEquals(Color.BLACK, checkButton.getBackground());
        assertEquals(Color.WHITE, checkButton.getForeground());
    }

    @Test
    public void testTextFieldProperties() {
        UpdateRoom updateRoom = new UpdateRoom();
        JTextField textField3 = updateRoom.textField3;
        JTextField textField4 = updateRoom.textField4;
        JTextField textField5 = updateRoom.textField5;

        assertNotNull(textField3);
        assertNotNull(textField4);
        assertNotNull(textField5);

        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textField3.getFont());
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textField4.getFont());
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), textField5.getFont());

        assertEquals(Color.BLACK, textField3.getForeground());
        assertEquals(Color.BLACK, textField4.getForeground());
        assertEquals(Color.BLACK, textField5.getForeground());
    }

    @Test
    public void testChoiceProperties() {
        UpdateRoom updateRoom = new UpdateRoom();
        Choice choice = updateRoom.c;

        assertNotNull(choice);
        assertEquals(new Font("Tahoma", Font.PLAIN, 14), choice.getFont());
        // Add more assertions based on the actual choices you have in your Choice component
    }

    @Test
    public void testActionPerformed() {
        UpdateRoom updateRoom = new UpdateRoom();

        // Simulate the action performed event for the check button
        ActionEvent actionEvent = new ActionEvent(updateRoom.check, ActionEvent.ACTION_PERFORMED, null);

        // Assuming that the actionPerformed method updates the text fields based on the selected item in the Choice component
        // You might want to add more specific assertions based on the actual behavior of the actionPerformed method
    }
}
