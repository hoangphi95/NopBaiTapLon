package quanlynhanvien.controller;

import quanlynhanvien.model.HrTimeManagement;
import quanlynhanvien.model.IfManager;
import quanlynhanvien.sevicer.ServicerIfInformation;
import quanlynhanvien.sevicer.ServiecerHR;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerHr {
    ServiecerHR serviecerHR = new ServiecerHR();
    HrTimeManagement hr=new HrTimeManagement();
    ServicerIfInformation servicerIfInformation=new ServicerIfInformation();
    Scanner sc=new Scanner(System.in);

    public void add() {
        try {
            System.out.println("Nhập vào mã  nhân viên");
            hr.setID(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập ngày công");
            hr.setWorkDay(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập ngày nghỉ");
            hr.setDayOff(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập vào tiền lương 1 ngày");
            hr.setSalaryByDay(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập lương tháng");
            hr.setMonthySalary(Integer.parseInt(sc.nextLine()));
            serviecerHR.Add(hr);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, xin vui lòng nhập số");
            add();
        }
    }

    public void enterWorkDay() {
        try {
            System.out.println("Nhập mã nhân viên");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số ngày đi làm");
            int wk = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số ngày nghỉ làm");
            int dof = Integer.parseInt(sc.nextLine());
            serviecerHR.EnterWorkDay(wk, dof, id);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, Xin vui lòng nhập số");
            enterWorkDay();
        }
    }

    public void payroll() {
        try {
            System.out.println("Nhập vào mã  nhân viên");
            int id = sc.nextInt();
            serviecerHR.EnterPayRoll(id);
            servicerIfInformation.sreach(id);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, xin vui lòng nhập số");
            payroll();
        }
    }
    public void xem(){
        ArrayList<HrTimeManagement> list=serviecerHR.realAll();
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
