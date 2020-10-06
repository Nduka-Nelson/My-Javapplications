package pack4;

// Constructor chaining with Super() and This()

public class Worker extends  Manager {

	public String empName;
    public int empSalary;
    public String address;

    //default constructor of the class
    public Worker()
    {
    	
    	//this will call the constructor with String param
        this("Nduka");
       
    }
    public Worker( int x) 
    {
    	
    	super();
    	System.out.println("Worker class argument constructor, Value:"+x);
    	
    }

    public Worker(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 345678);
    }
    public Worker(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Calgary, NW, AB");
    }
    public Worker(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Worker obj = new Worker();
        obj.disp();
        
        Worker obj1 = new Worker();
        Worker obj2 = new Worker(10);
    }

}
