package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

class DashboardTest {

    @Test
    void testDashboardInitialization() {
        Dashboard dashboard = new Dashboard();

        // Kiểm tra xem Dashboard đã được khởi tạo thành công hay không
        assertNotNull(dashboard);
    }

    @Test
    void testReceptionButton() {
        Dashboard dashboard = new Dashboard();

        // Kiểm tra xem nút Reception đã được tạo thành công hay không
        JButton receptionButton = dashboard.rec;
        assertNotNull(receptionButton);

        // Kiểm tra xem nút Reception có được thêm ActionListener hay không
        ActionListener[] actionListeners = receptionButton.getActionListeners();
        assertTrue(actionListeners.length > 0);
    }

    @Test
    void testAdminButton() {
        Dashboard dashboard = new Dashboard();

        // Kiểm tra xem nút Admin đã được tạo thành công hay không
        JButton adminButton = dashboard.add;
        assertNotNull(adminButton);

        // Kiểm tra xem nút Admin có được thêm ActionListener hay không
        ActionListener[] actionListeners = adminButton.getActionListeners();
        assertTrue(actionListeners.length > 0);
    }

    @Test
    void testActionPerformed() {
        Dashboard dashboard = new Dashboard();

        // Kiểm tra xem actionPerformed có hoạt động đúng hay không khi click nút Reception
        ActionEvent receptionEvent = new ActionEvent(dashboard.rec, ActionEvent.ACTION_PERFORMED, null);
        assertDoesNotThrow(() -> dashboard.actionPerformed(receptionEvent));

        // Kiểm tra xem actionPerformed có hoạt động đúng hay không khi click nút Admin
        ActionEvent adminEvent = new ActionEvent(dashboard.add, ActionEvent.ACTION_PERFORMED, null);
        assertDoesNotThrow(() -> dashboard.actionPerformed(adminEvent));
    }
}
