package hausrt.vk.a_hello;

public class User {
	private int id;
	private String name;
	
	public User() {
		super();
		System.out.println("------User���󴴽�------");
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init_user(){
		System.out.println("��������֮�󣬳�ʼ��");
	}
	
	public void destory_user(){
		System.out.println("IOC�������٣�user�����ʼ��");
	}
	
	
}