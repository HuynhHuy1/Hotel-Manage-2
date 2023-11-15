package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

class CustomerInfoTest {

    @Test
    void testCustomerInfoInitialization() {
        CustomerInfo customerInfo = new CustomerInfo();

        // Kiểm tra xem CustomerInfo đã được khởi tạo thành công hay không
        assertNotNull(customerInfo);
    }

    @Test
    void testBackButton() {
        CustomerInfo customerInfo = new CustomerInfo();

        // Kiểm tra xem nút Back đã được tạo thành công hay không
        JButton backButton = customerInfo.getBackButton();
        assertNotNull(backButton);

        // Kiểm tra xem nút Back có được thêm ActionListener hay không
        ActionListener[] actionListeners = backButton.getActionListeners();
        assertTrue(actionListeners.length > 0);
    }

    @Test
    void testTable() {
        CustomerInfo customerInfo = new CustomerInfo();

        // Kiểm tra xem JTable đã được tạo thành công hay không
        JTable table = customerInfo.getTable();
        assertNotNull(table);

        // Kiểm tra xem JTable có mô hình dữ liệu hay không
        TableModel tableModel = table.getModel();
        assertNotNull(tableModel);
    }

    @Test
    void testSetConnectionDB() {
        CustomerInfo customerInfo = new CustomerInfo();
        ConnectionDB connectionDB = new ConnectionDB();

        // Kiểm tra xem phương thức setConnectionDB có hoạt động đúng hay không
        customerInfo.setConnectionDB(connectionDB);
        assertEquals(connectionDB, customerInfo.connectionDB);
    }
}
