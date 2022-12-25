package handson;

public class JavaBuilder {
	
	private String id;
	private int num;
	
//	public JavaBuilder(String id2, int num2) {
//		// TODO Auto-generated constructor stub
//	}

	public JavaBuilder setId(String id) {
		this.id = id;
		return this;
	}
	
	public JavaBuilder setNum(int num) {
		this.num = num;
		return this;
	}
	
	public JavaBuilder getJavaBuilder() {
		return this;
	}
	
	JavaBuilder obj = new JavaBuilder().setId(id).setNum(num).getJavaBuilder();

}
