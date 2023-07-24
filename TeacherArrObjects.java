import java.util.Scanner;
class EmployeeT {
int empid;
String name;
float salary;
String address;
EmployeeT(){}
EmployeeT(int empid,String name,float salary,String address){
this.empid = empid;
this.name = name;
this.salary = salary;
this.address = address;
}
}
class Teacher extends EmployeeT{
String department,subject;
Teacher(int empid,String name, float salary , String address,String department, String subject){
super(empid,name,salary,address);
this.department = department;
this.subject = subject;
}
public void display() {
System.out.println("Teacher_id_:_"+ empid);
System.out.println("Teacher_name_:_"+ name);
System.out.println("Teacher_salary_:_"+ salary);
System.out.println("Teacher_address_:_"+ address);
System.out.println("Teacher_department_:_"+ department);
System.out.println("Teacher_subject_:_"+ subject);
}
}
public class TeacherArrObjects {
public static void main(String[] args){
System.out.println("_Enter_number_of_Teachers_:_");
Scanner sc = new Scanner (System . in );
int n = sc.nextInt();
System.out.println ( "_Enter_Teacher_details_one_by_one_.._");
Teacher teacher[] = new Teacher[n];
Scanner scT = new Scanner (System . in);
int tid;String name;float salary;String address;
String department;String subject;
for (int i=0;i<n;i++){
System.out.println("_Enter_"+i+"_teacher_details.._");
System.out.println("_Enter_teacher_id_(_integer_)_:_");
tid = scT.nextInt();
System.out.println ("_Enter_teacher_name_(_String_)_:_");
name = scT.next();
System.out.println ("_Enter_teacher_salary_(_float_)_:_");
salary = scT.nextFloat();
System.out.println ("_Enter_teacher_address_(_String_)_:_");
address = scT.next();
System.out.println ("_Enter_teacher_department_(_String_)_:_");
department = scT.next();
System.out.println ("_Enter_teacher_subject_(_String_)_:_");
subject = scT.next();
Teacher t = new Teacher(tid , name , salary , address , department ,subject );
 teacher[i] = t;
}
System.out.println("_Teacher_are_:_\n_");
for (Teacher x : teacher){
x.display();
System.out.println("\n");
}
}
}
