import java.util.Arrays;
import java.util.Scanner;
class Employee{
	int eNo,eSalary;
	String eName;
	public Employee(){
	}
	public Employee(int no,int sal,String name){
		eNo=no;
		eSalary=sal;
		eName=name;
	}
	public void showData(){
		System.out.print("EmpId_=_"+eNo+"__"+"_Name_=_"+eName+"__"+"Salary_=_"+eSalary);
		System.out.println();
	}
}
public class EmpArrObjects{
	public static void main(String[] args){
		System.out.println("Enter_number_of_employees:_");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter_Employee_details_one_by_one.");
		Employee employees[]=new Employee[n];
		Scanner sc_emp=new Scanner(System.in);
		Int eid,esal;
		String enam;
		for(int i=0;i<n;i++){
			System.out.println("Enter_"+i+"_employee_details.");
			System.out.println("Enter_employee_id_(integer):_");
			eid=sc_emp.nextInt();
			System.out.println("Enter_employee_name_(String):_");
			String nam=sc_emp.next();
			enam=new String(nam);
			System.out.println("Enter_employee_salary_(integer):_");
			esal=sc_emp.nextInt();
			Employee emp=new Employee(eid,esal,enam);
			employees[i]=emp;
		}
		System.out.println("Employees_are:_\n");
		for(Employee y: employees)y.showData();
		System.out.println("Enter_employee_number_to_search:_");
		int semp=sc.nextInt();
		boolean found=false;
		for(Employee e: employees){
			if (semp==e.eNo){
				found=true;
				System.out.pintln("Employee_found.");
				e.showData();
				break;
			}
			}
			if(! found){
				System.out.println("Employee_not_found.");
			}
	}
}