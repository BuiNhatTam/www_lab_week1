package www_java.week01.repository;

import www_java.week01.entities.Log;

import java.util.ArrayList;
import java.util.List;

public class LogRepository {
    public List<Log> findAll(){
        return new ArrayList<>();
    }
    public Log findById(String accountId) {
        // Tìm tài khoản theo ID
        return null;
    }

    public void save(Log account) {
        // Thêm mới hoặc cập nhật tài khoản
    }

    public void delete(String accountId) {
        // Xóa tài khoản theo ID
    }
}
