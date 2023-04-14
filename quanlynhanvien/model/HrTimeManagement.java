package quanlynhanvien.model;

import java.io.Serializable;

public class HrTimeManagement extends Information implements Serializable {
    // số  Ngày đi làm
    private int workDay;
    // Số ngày nghỉ làm
    private int dayOff;
    // Số lượng của 1 ngày
    private int salaryByDay;
    // Số lương của 1 tháng
    private int monthySalary;
    public HrTimeManagement(){

    }

    public HrTimeManagement( int ID, int workDay, int dayOff, int salaryByDay, int monthySalary) {
        super.setID(ID);
        this.workDay = workDay;
        this.dayOff = dayOff;
        this.salaryByDay = salaryByDay;
        this.monthySalary = monthySalary;
    }



    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public int getSalaryByDay() {
        return salaryByDay;
    }

    public void setSalaryByDay(int salaryByDay) {
        this.salaryByDay = salaryByDay;
    }

    public int getMonthySalary() {
        return monthySalary;
    }

    public void setMonthySalary(int monthySalary) {
        this.monthySalary = monthySalary;
    }

    @Override
    public String toString() {
        return "HrTimeManagement{" +
                "Mã nhân viên="+super.getID()+
                ",Ngày đi làm=" + workDay +
                ",Ngày nghỉ=" + dayOff +
                ", Lương ngày=" + salaryByDay +
                ", Lương tháng=" + monthySalary +
                '}';
    }
}
