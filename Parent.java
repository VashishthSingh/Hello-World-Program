// Java Feature 1.1 Inheritance

// Single Inheritance
class Employee{  
    private int empId;
    private String empPosition;
    public void setEmpDet(int e,String pos){
      empId=e;
      empPosition=pos;
    }
    public void showEmpDet(){
      System.out.println("EmpId="+empId);
      System.out.println("empPosition="+empPosition);
    }
}
class Ramesh extends Employee{
  private String vehicleName;
  public void setRamesh(String s){
   vehicleName=s;
  }
  public void showRameshDet(){
   System.out.println("vehicle Name="+vehicleName);
  }
}
public class Parent{  
    public static void main(String args[]){  
      Ramesh r=new Ramesh();
      r.setEmpDet(3323,"Trainee");
      r.setRamesh("Cycle");
      r.showEmpDet();
      r.showRameshDet();
    }  
}
