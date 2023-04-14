package quanlynhanvien.controller;

import quanlynhanvien.model.IfManager;
import quanlynhanvien.sevicer.ServicerIfInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerIF {
    ServicerIfInformation siv=new ServicerIfInformation();
    IfManager ifm = new IfManager();
    Scanner sc=new Scanner(System.in);
    public void xem(){
        ArrayList <IfManager> list=siv.realAll();
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    public void add(){
        try {
            System.out.println("Nhập mã nhân viên");
            ifm.setID(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập tên");
            ifm.setStaffName(sc.nextLine());
            System.out.println("Ngày sinh");
            ifm.setDateOfBirth(sc.nextLine());
            System.out.println("Học vấn");
            ifm.setAcademicLevel(sc.nextLine());
            System.out.println("tình trạng hôn nhân");
            ifm.setMaritalStatus(sc.nextLine());
            System.out.println("Nhập thâm niên");
            ifm.setSeniority(sc.nextInt());
            siv.add(ifm);
        }catch (Exception e){
            System.out.println("Loi nhap lieu");
            add();
        }
    }
    public void UpDate() {
        try {
            System.out.println("Nhập tên");
            ifm.setStaffName(sc.nextLine());
            System.out.println("Nhập mã nhân viên");
            int c = Integer.parseInt(sc.nextLine());
            ifm.setID(c);
            System.out.println("Ngày sinh");
            ifm.setDateOfBirth(sc.nextLine());
            System.out.println("Học vấn");
            ifm.setAcademicLevel(sc.nextLine());
            System.out.println("tình trạng hôn nhân");
            ifm.setMaritalStatus(sc.nextLine());
            System.out.println("Nhập thâm niên");
            ifm.setSeniority(sc.nextInt());
            siv.update(ifm);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, Xin vui lòng nhập số ");
        }
    }

    public void delete() {
        try {
            System.out.println("Nhập mã nhân viên");
            ifm.setID(Integer.parseInt(sc.nextLine()));
            siv.delete(ifm);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, XIn vui lòng nhập số");
            delete();
        }
    }

    public void longtimeEmpolyee() {
        try {
            System.out.println("Nhập mã nhân viên");
            int kt = sc.nextInt();
            siv.longtimeEmpolyee(kt);
        }catch (Exception e){
            System.out.println("Lỗi nhập liệu, Xin vui lòng nhập số ");
        }
    }
}
