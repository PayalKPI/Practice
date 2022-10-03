package Abstraction_4;

public class DoctorStrange extends Movie {

	@Override
	String name() {
		// TODO Auto-generated method stub
		System.out.println("Movie is DoctorStrange");
		return "DoctorStrange";
		
	}

	@Override
	String director() {
		// TODO Auto-generated method stub
		System.out.println("Director is Sam Raimi");
		return "Sam Raimi";
		
	}

}
