package Abstraction_4;

public class Thor extends Movie {

	@Override
	
	public String name() {
		// TODO Auto-generated method stub
		System.out.println("Movie is Thor");
		return "Thor";
		
	}

	@Override
	public String director() {
		// TODO Auto-generated method stub
		System.out.println("Director is Alan Taylor");
		return "Alan Taylor";
	}

}
