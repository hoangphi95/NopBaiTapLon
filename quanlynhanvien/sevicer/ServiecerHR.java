package quanlynhanvien.sevicer;

import quanlynhanvien.model.HrTimeManagement;
import quanlynhanvien.model.IfManager;
import quanlynhanvien.myfile.MyFile;
import quanlynhanvien.myfile.MyFileHr;

import java.util.ArrayList;

public class ServiecerHR {
    HrTimeManagement hrT=new HrTimeManagement();
    ServicerIfInformation svif=new ServicerIfInformation();
    private static ArrayList<HrTimeManagement> list = new ArrayList<>();
    private static final String fileName="Hr.txt";
    MyFile mf = new MyFile();
    MyFileHr myFileHr=new MyFileHr();

    public void Add(HrTimeManagement hrT) {
                        list.add(hrT);
                        myFileHr.output(list,fileName);
    }

    public ArrayList<HrTimeManagement> realAll() {
        list= (ArrayList<HrTimeManagement>) myFileHr.input(fileName);
        return list;
    }

    public void EnterWorkDay(int wk, int Do, int id) {
        try {
            list = (ArrayList<HrTimeManagement>) myFileHr.input(fileName);
            for (int i = 0; i < list.size(); ++i) {
                if (list.get(i).getID() == id) {
                    list.get(i).setWorkDay(wk);
                    list.get(i).setDayOff(Do);
                    myFileHr.output(list, fileName);
                }
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());
        }

    }

    public int payRoll(int id) {
        list = (ArrayList<HrTimeManagement>) myFileHr.input(fileName);
        int sum = 0;
        for (HrTimeManagement hrtime : list) {
            if (hrtime.getID() == id && hrtime.getWorkDay() >= 24) {
                sum = hrtime.getSalaryByDay() * hrtime.getWorkDay() + hrtime.getSalaryByDay();
            } else if (hrtime.getID() == id && hrtime.getWorkDay() < 24 && hrtime.getWorkDay() > 18) {
                sum = hrtime.getSalaryByDay() * hrtime.getWorkDay();
            } else if (hrtime.getID() == id && hrtime.getWorkDay() < 18) {
                sum = hrtime.getSalaryByDay() * hrtime.getWorkDay() - hrtime.getSalaryByDay();
            }
        }
        return sum;
    }



    public void EnterPayRoll ( int cid) {
        try {

            list = (ArrayList<HrTimeManagement>) myFileHr.input(fileName);
            int tsum = payRoll(cid);
            for (int i = 0; i < list.size(); ++i) {
                if (list.get(i).getID() == cid) {
                    list.get(i).setMonthySalary(tsum);
                    myFileHr.output(list, fileName);
                    System.out.println(list.get(i).toString());
                }
            }

        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e.getCause());
        }
    }

}
