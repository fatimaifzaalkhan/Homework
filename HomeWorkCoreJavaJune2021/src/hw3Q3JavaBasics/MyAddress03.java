package hw3Q3JavaBasics;

public class MyAddress03 {

	public static void main(String[] args) {
			  String MyName = "Fatima Khan";
			  int houseNumber = 1559;
			  String HouseStreet = "Jarvis Ave";
			  String CityName = "Bronx";
	          String state = "New York";
			  int zipcode = 10461;
			  boolean inUSA = true;
			  
			  System.out.println(MyName +" "+ houseNumber +" "+ HouseStreet +" "+ CityName +" "+ state +" "+ zipcode +" "
			          + inUSA);
			  System.out.println("\n\t" + MyName +"\n\t"+ houseNumber +"\n\t"+ HouseStreet +"\n\t"+ CityName +"\n\t"+ state + "\n\t"
			          + zipcode +"\n\t" + inUSA);
			  System.out.println( "\n\t"+ MyName +"\n\t "+ houseNumber+","+ HouseStreet+","+CityName+","+state+"\n\t "
			          +zipcode+"\n\t "+inUSA);
			  System.out.println( "\n\t"+ MyName +"\n\t "+ houseNumber+","+ HouseStreet+"\n\t "+CityName+","+state+","
			          +zipcode+"\n\t "+inUSA);

	}

}
