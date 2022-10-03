package Diamond;

public class Helper implements Parent1, Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helper t = new Helper();
		t.show();
		

	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		Parent1.super.show();
		return Parent2.super.show();
		
	}

}
