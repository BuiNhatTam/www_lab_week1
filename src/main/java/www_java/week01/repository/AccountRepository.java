package www_java.week01.repository;

import www_java.week01.entities.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public List<Account> findAll(){
        return new ArrayList<>();
    }
    public Account findById(String accountId) {
        // Tìm tài khoản theo ID
        return null;
    }

    public void save(Account account) {
        // Thêm mới hoặc cập nhật tài khoản
    }

    public void delete(String accountId) {
        // Xóa tài khoản theo ID
    }
}
