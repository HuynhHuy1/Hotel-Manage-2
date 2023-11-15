package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckOutTest {

    @Test
    void testPerformCheckOut() {
        CheckOut checkOut = new CheckOut();

        // Thiết lập dữ liệu giả định
        checkOut.customerChoice.add("123");
        checkOut.roomNumberLabel.setText("101");

        // Gọi phương thức cần kiểm thử
        checkOut.performCheckOut();

        // Kiểm tra xem JLabel đã được cập nhật đúng cách hay không
        assertFalse(checkOut.isVisible());
    }

    @Test
    void testPerformCheck() {
        CheckOut checkOut = new CheckOut();

        // Thiết lập dữ liệu giả định
        checkOut.customerChoice.add("123");
        checkOut.roomNumberLabel.setText("101");

        // Gọi phương thức cần kiểm thử
        checkOut.performCheck();

        // Kiểm tra xem JLabel đã được cập nhật đúng cách hay không
        assertEquals("101", checkOut.roomNumberLabel.getText());
        // Trong trường hợp này, checkInTimeLabel không được cập nhật vì resultSet.next() là false
        assertEquals("", checkOut.checkInTimeLabel.getText());
    }
}
