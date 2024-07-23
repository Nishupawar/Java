package CollectionConcept;

public class Student implements Comparable<Student> {
    int rn;
String name;
int marks;
 public Student(int rn, String name, int marks) {

	this.rn = rn;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
}

public int compareTo(Student obj)
{
	if(this.marks > obj.marks)
		return 1;
	else if(this.marks < obj.marks)
		return -1;
	else
     return 0;
}
}
