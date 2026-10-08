import java.util.Vector;
import java.util.*;
class Employee
{
    private int id;
    private String name;
    private String department;
    private String designation;
    private double salary;

    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Department");
        department=sc.nextLine();
        System.out.println("Enter Designation");
        designation=sc.nextLine();
        System.out.println("Enter Salary");
        salary=sc.nextDouble();
    }
    public void showdata()
    {
        System.out.println("ID: "+id+"\tName: "+ name+"\tDepartment: "+ department+"\tDesignation: "+designation+"\tSalary: "+salary);

    }
	public void setName(String n)
	{
		name=n;
	}
	public void setDepartment(String d)
	{
		department=d;
	}

    public int getid()
    {
        return id;
    }
    
}
public class EmployeeManagement
{
   
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int ch;
         Vector<Employee> v= new Vector<>();
        do{
			System.out.println("============================================");
            System.out.println("Employee Details System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Exit Program");
            System.out.println(" Enter Choice:");
			System.out.println("============================================");
			ch=sc.nextInt();			
			Employee obj=new Employee();
			int ids;
            switch(ch)
            {
                case 1:
					obj.getdata();
                    v.add(obj);
                    System.out.println("Employee Details added");
                    break;
                case 2:
					    for(Employee e: v)
						{
							e.showdata();
						}
                    break;
                case 3:
                    System.out.println("Enter ID: ");
                    ids=sc.nextInt();
                    for(Employee e: v)
                    {
                        if(ids==e.getid())
                        {
                            System.out.println("Record found:");
							e.showdata();
                        }
                    }
                    break;
					
				case 4:
					System.out.println("Enter ID of the Employee to change data");
					ids=sc.nextInt();
					sc.nextLine();
					for(Employee e:v)
					{
						if(ids==e.getid())
						{
							System.out.println("Enter new Name:");
							e.setName(sc.nextLine());
							System.out.println("Enter new Department:");
							e.setDepartment(sc.nextLine());
						}
					}
					break;
				case 5:
					System.out.println("Enter Employee ID to Delete");
					ids=sc.nextInt();
					for(int i=0; i<v.size(); i++)
					{
						if(ids==v.get(i).getid())
						{
							v.remove(i);
							System.out.println("Employee record deleted succesfully");
							break;
						}
					}
					break;
				case 6:
					System.out.println("Exited_Thankyou!");
					break;
                default:
                    System.out.println("Invalid Input!");

            }
        }while(ch!=6);
    }
}