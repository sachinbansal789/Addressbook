public class Contact {

    private String fname; 
    private String lname; 
    private String add;  
    private String city; 
    private String state; 
    private long phonenumber; 
    private long zip;  
    
    public Contact(String fname, String lname, String add, String city, String state, long phonenumber, long zip) {
                this.fname=fname;
        this.lname=lname;
        this.add=add;
        this.city=city;
        this.state=state;
        this.phonenumber=phonenumber;
        this.zip=zip;
    }

     public String getfName() {
                return fname;
    }

    
    public String getlName() {
        return lname;
    }

    
    public String getAdd() {
        return add;
    }

    
    public String getCity() {
        return city;
    }

    
    public String getState() {
        return state;
    }

    
    public long getNumber() {
                return phonenumber;
    }

    
    public long zip() {
        return zip;
    }

    
    public void printcontact() {
                System.out.print("Name: " +fname+" "+lname+", Address: "+add+ ", City: " +city+", State: "+state);
                System.out.println(", Phone: " +phonenumber+ ", Pin Code: " + zip + ".");
    }
}

