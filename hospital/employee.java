public class employee extends user {
    private double salary;

    public employee(){
        super();
    }
    public employee(int id,String firstName,String lastName,String  phoneNumber){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        this.salary=salary;
    }


    
    public double setsalary(){
        return salary;
    }
    public void getsalary(){
        this.salary=salary;
    }
    public void disp(){
        super.display();
        
    }
   


    
}
