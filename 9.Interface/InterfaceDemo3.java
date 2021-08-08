  interface BaseInfo
  {
     void getStudentData(String name,String address);
     void putStudentData();
  }
  interface StudentInfo extends BaseInfo
  {
     void getAcademicData(String branch,int semester);
     void putAcademicData();
  }
  class Student implements StudentInfo
  {
     String name,address;
     String branch;
     int semester;
     public void getStudentData(String name,String address)
     {
        this.name = name;
        this.address = address;
     }
     public void putStudentData()
    {
         System.out.println("Name                     :"+name);
         System.out.println("Address                  :"+address);
    }
     public void getAcademicData(String branch,int semester)
     {
        this.branch = branch;
        this.semester = semester;
     }
     public void putAcademicData()
    {
         System.out.println("Branch                   :"+branch);
         System.out.println("Semester                 :"+semester);
    }
  }
 class InterfaceDemo3
 {
    public static void main(String [] args)
    {
        Student s = new Student();
        s.getStudentData("Nitin Wankar","Surabhi nagar");
        s.getAcademicData("Electrical",5);
        s.putStudentData();
        s.putAcademicData();
   }
 }