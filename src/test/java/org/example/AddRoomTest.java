package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddRoomTest {

    private AddRoom addRoom;

    @BeforeEach
    public void setUp() {
        // Khởi tạo AddRoom trước mỗi test
        addRoom = new AddRoom();
    }

    @AfterEach
    public void tearDown() {
        // Giải phóng các tài nguyên sau mỗi test
        addRoom.setVisible(false);
        addRoom.dispose();
    }

    @Test
    public void testRoomAddition() {
        // Chuẩn bị dữ liệu đầu vào
        addRoom.jtf_room_number.setText("101");
        addRoom.jcb_availability.setSelectedItem("Available");
        addRoom.jcb_clean.setSelectedItem("Cleaned");
        addRoom.jtf_price.setText("100");
        addRoom.jcb_type.setSelectedItem("Single Bed");

        // Kích hoạt sự kiện "Add"
        addRoom.btn_add.doClick();
    }

    @Test
    public void testCancelButton() {
        // Kích hoạt sự kiện "Back"
        addRoom.btn_back.doClick();

        // Kiểm tra xem cửa sổ đã ẩn đi không
        assertFalse(addRoom.isVisible());
    }
}
