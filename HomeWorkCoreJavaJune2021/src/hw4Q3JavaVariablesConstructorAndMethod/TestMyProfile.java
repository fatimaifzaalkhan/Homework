package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyProfile {

	public static void main(String[] args) {
		MyProfile marwa = new MyProfile(); // Constructor initialized
		marwa.MyName = "Fatima";
		marwa.mySex = 'F';
		marwa.myAge = 22;
		marwa.usCitizen = true;
		marwa.yearswork = 3;
		marwa.myHouseRent = 1800;
		marwa.mySalary = 122000;
		marwa.myClassGrade = 3.860f;
		marwa.myHight = 1.5206126;
		marwa.myProfile();

		MyProfile maria = new MyProfile(); // Constructor initialized
		maria.MyName = "sarah";
		maria.mySex = 'F';
		maria.myAge = 24;
		maria.usCitizen = true;
		maria.yearswork = 5;
		maria.myHouseRent = 600;
		maria.mySalary = 124000;
		maria.myClassGrade = 3.420f;
		maria.myHight = 1.5206124;
		maria.myProfile();
		
	}

}
