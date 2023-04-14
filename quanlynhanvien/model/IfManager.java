package quanlynhanvien.model;

import java.io.Serializable;

public class IfManager extends Information implements Serializable {
    // Trình độ học vấn
    private String academicLevel;
    // tình trạng hôn nhân;
    private String maritalStatus;
    // Thâm niên
    private int seniority;
    public IfManager(){

    }

    public IfManager(String staffName, int ID, String dateOfBirth, String academicLevel, String maritalStatus, int seniority) {
        super(staffName, ID, dateOfBirth);
        this.academicLevel = academicLevel;
        this.maritalStatus = maritalStatus;
        this.seniority = seniority;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "IfManager{" +
                "Tên nhân viên="+super.getStaffName()+
                ", Mã nhân viên="+super.getID()+
                ", Ngày sinh="+super.getDateOfBirth()+
                ", Học vấn='" + academicLevel + '\'' +
                ", Tình trạng hôn nhân='" + maritalStatus + '\'' +
                ", Thâm niên='" + seniority + '\'' +
                '}';
    }
}
