package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate1 = null;
		try {
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date dBirthDate2 = null;
		try {
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-03-12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date dBirthDate3 = null;
		try {
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-05-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date dBirthDate4 = null;
		try {
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1989-11-29");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date dBirthDate5 = null;
		try {
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1989-05-24");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Sehar", "Maleeha", "Khan", dBirthDate2, "216 Labrador Lane", "302-555-3333", "skhan@udel.edu","MIS");
		Student stu3 = new Student("Jenna", "Evelyn", "Bergman", dBirthDate3, "218 Labrador Lane", "302-718-9999", "jbergman@udel.edu","MIS");
		Student stu4 = new Student("Gabe", "James", "Rust-Tierney", dBirthDate4, "220 Labrador Lane", "302-456-2222", "grust@udel.edu","MIS");
		Student stu5 = new Student("Emma", "Marie", "Javits", dBirthDate5, "222 Labrador Lane", "302-655-4444", "ejavits@udel.edu","MIS");
		
		HashMap map = new HashMap();
		
		map.put("Bert", stu1.getPersonID());
		map.put("Sehar",stu2.getPersonID() );
		map.put("Jenna",stu3.getPersonID() );
		map.put("Gabe", stu4.getPersonID());
		map.put("Emma",stu5.getPersonID() );


		assertTrue(1==1);
		assertTrue(map.size() == 5);
	}

}
