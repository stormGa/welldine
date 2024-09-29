package cn.lkh.welldine.model;

/**
 * 管理员
 */
public class Admin {
    private int AdminId;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Admin{" +
                "AdminId=" + AdminId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
