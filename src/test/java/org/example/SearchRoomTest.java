package org.example;

import org.junit.jupiter.api.Test;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import static org.junit.jupiter.api.Assertions.*;

public class SearchRoomTest {

    @Test
    public void testSearchButtonProperties() {
        SearchRoom searchRoom = new SearchRoom();
        JButton searchButton = searchRoom.add;

        assertNotNull(searchButton);
        assertEquals("Search", searchButton.getText());
        assertEquals(new Font("Tahoma", Font.BOLD, 14), searchButton.getFont());
        assertEquals(Color.BLACK, searchButton.getBackground());
        assertEquals(Color.WHITE, searchButton.getForeground());
    }

    @Test
    public void testBackButtonProperties() {
        SearchRoom searchRoom = new SearchRoom();
        JButton backButton = searchRoom.back;

        assertNotNull(backButton);
        assertEquals("Back", backButton.getText());
        assertEquals(new Font("Tahoma", Font.BOLD, 14), backButton.getFont());
        assertEquals(Color.BLACK, backButton.getBackground());
        assertEquals(Color.WHITE, backButton.getForeground());
    }

    @Test
    public void testCheckBoxProperties() {
        SearchRoom searchRoom = new SearchRoom();
        JCheckBox checkBox = searchRoom.checkBox;

        assertNotNull(checkBox);
        assertEquals("Only Display Available", checkBox.getText());
        assertEquals(Color.WHITE, checkBox.getForeground());
        assertEquals(new Color(3, 45, 48), checkBox.getBackground());
    }

    @Test
    public void testChoiceProperties() {
        SearchRoom searchRoom = new SearchRoom();
        Choice bedTypeChoice = searchRoom.choice;

        assertNotNull(bedTypeChoice);
        assertEquals("Single Bed", bedTypeChoice.getItem(0));
        assertEquals("Double Bed", bedTypeChoice.getItem(1));
        // Add more assertions based on the actual choices you have in your Choice component
    }

    @Test
    public void testTableProperties() {
        SearchRoom searchRoom = new SearchRoom();
        JTable table = searchRoom.table;

        assertNotNull(table);
        assertEquals(new Color(3, 45, 48), table.getBackground());
        assertEquals(Color.WHITE, table.getForeground());
    }

    @Test
    public void testActionPerformed() {
        SearchRoom searchRoom = new SearchRoom();

        // Simulate the action performed event for the search button
        ActionEvent actionEvent = new ActionEvent(searchRoom.add, ActionEvent.ACTION_PERFORMED, null);
        searchRoom.actionPerformed(actionEvent);

        // Assuming that the search button click will trigger some action
        // You might want to add more specific assertions based on the actual behavior of the actionPerformed method
        // For example, you can assert that the table model is updated based on the checkbox state and bed type choice.
    }
}
