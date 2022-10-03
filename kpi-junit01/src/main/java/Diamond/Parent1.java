package Diamond;

public interface Parent1 extends GrandParents  {
	default String show() {
		
		return "Parent1";
	}

}
