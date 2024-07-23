//package Constructor;

public class Student {
    String name;
long phoneNo;
String email;
String add;
String dob;

public Student(String name,long phoneNo) {
	this(name,phoneNo,"");
}

public Student(String name,long phoneNo,String email)
{
	this(name,phoneNo,email,"","");
}

public Student(String name,long phoneNo,String email,String add,String dob)
{
	this.name= name;
	this.phoneNo= phoneNo;
	this.email= email;
	this.add= add;
	this.dob=dob;
}
public String toString()
{
	return "Student [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", add=" + add + ", dob=" + dob
			+ "]";
}




    public static void main(String[] args) {
        
    }
}

