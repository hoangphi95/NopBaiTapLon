package quanlynhanvien.model;

import java.io.Serializable;

public class Information implements Serializable {
    // tên nhân viên
    private String staffName;
    // Mã nhân viên
    private int ID;
    // ngày sinh
   private String dateOfBirth;

    public Information(){

    }

    public Information(String staffName, int ID, String dateOfBirth) {
        this.staffName = staffName;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int citizenID) {
        this.ID = citizenID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Information{" +
                "Tên Nhân viên='" + staffName + '\'' +
                ", Mã nhân viên=" + ID +
                ", Ngày sinh=" + dateOfBirth +
                '}';
    }
}
