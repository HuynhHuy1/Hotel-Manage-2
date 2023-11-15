package org.example;

import org.junit.jupiter.api.Test;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testBackButtonProperties() {
        Room room = new Room();
        JButton backButton = room.back;

        assertNotNull(backButton);
        assertEquals("BACK", backButton.getText());
        assertEquals(new Font("Tahoma", Font.BOLD, 14), backButton.getFont());
        assertEquals(Color.BLACK, backButton.getBackground());
        assertEquals(Color.white, backButton.getForeground());
    }

    @Test
    public void testTableProperties() {
        Room room = new Room();
        JTable table = room.table;

        assertNotNull(table);
        assertEquals(new Color(3, 45, 48), table.getBackground());
        assertEquals(Color.WHITE, table.getForeground());
    }

    @Test
    public void testRoomColumnHeader() {
        Room room = new Room();
        JTable table = room.table;

        assertNotNull(table);
        assertEquals("Room No.", table.getColumnName(0));
        assertEquals("Availability", table.getColumnName(1));
        assertEquals("Clean Status", table.getColumnName(2));
        assertEquals("Price", table.getColumnName(3));
        assertEquals("Bed Type", table.getColumnName(4));
    }

    @Test
    public void testActionPerformed() {
        Room room = new Room();

        // Assuming back button click should hide the room frame
        room.back.getActionListeners()[0].actionPerformed(null);
        assertFalse(room.isVisible());
    }
}
