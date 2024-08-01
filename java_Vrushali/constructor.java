import java.util.Scanner;
class Employee{

    public 
                String first_name;
                String last_name;
                String employee_id;               
                String gender;
                double salary;
                
    public  Employee(String f_name,String l_name,String e_id,String g,double s )
	{
        this.first_name=f_name;
       this.last_name=l_name;
        this.employee_id=e_id;
        this.gender=g;
        this.salary=s;

    }
    public void get_data(){
        System.out.println("employee id     first_name         last_name      salary     gender");
        System.out.println(employee_id+"       "+first_name+ "          "+last_name+"      " + salary+"           "+ gender);
        
    }
    public void set_salary(double s1)
	{
        salary=s1;
    }
    public double get_salary()
	{
        return salary;
    }
    public double raise_salary()
	{
         salary+=salary*0.1;
        System.out.println(salary);
        return (salary*12);
    }
}
class constructor{

    public static void main(String[] args) 
	{
        String f_n;
        String l_n;
        String e_id;
        String g;
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("First name ");
        f_n=sc.nextLine();
        System.out.println("Last Name");
        l_n=sc.nextLine();
        System.out.println("Employee ID");
        e_id=sc.nextLine();
        System.out.println("Gender");
        g=sc.nextLine();
        System.out.println("Salary");
        s=sc.nextDouble();
       /* Employee[] obj1=new Employee[2];
        for(int i;i<2;i++)
		{
			obj1[i]=new Employee(f_n,l_n,e_id,g,s);
			obj1[i].set_salary(s);
			 s=obj1.get_salary();
			double s2=obj1.raise_salary();
			obj1[i].set_salary(s2);

			obj1[i].get_data();
        }
		*/
		
		Employee obj1=new Employee(f_n,l_n,e_id,g,s);
		obj1.set_salary(s);
		//s=obj1.get_salary();
		
		Employee obj2 =new Employee(f_n,l_n,e_id,g,s);
		double s2=obj1.raise_salary();
		obj2.set_salary(s2);
		obj2.get_data();
	}      
}
