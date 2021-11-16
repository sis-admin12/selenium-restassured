
public class Student {

	int sid;
	String sname;
	int sub1, sub2, sub3;

	void getStuData(int id, String name) {
		sid = id;
		sname = name;
	}

	void getStuMarks(int s1, int s2, int s3) {
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
	}

	void totalMarks() {
		int total = sub1 + sub2 + sub3;

		System.out.println("student id:" + sid);
		System.out.println("student name:" + sname);
		System.out.println("Total Marks:" + total);
	}

	public static void main(String args[]) {
		Student stu = new Student();
		stu.getStuData(101, "Kiran");
		stu.getStuMarks(90, 85, 70);
		stu.totalMarks();
	}

}
