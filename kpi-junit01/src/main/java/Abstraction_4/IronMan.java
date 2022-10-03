package Abstraction_4;

public class IronMan extends Movie {

	@Override
	String name() {
		// TODO Auto-generated method stub
		System.out.println("Movie name is IronMan");
		return "IronMan";
		
	}

	@Override
	String director() {
		// TODO Auto-generated method stub
		System.out.println("Director is Jon Favreau");
		return "Jon Favreau";
		
	}

}
