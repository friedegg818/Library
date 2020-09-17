package library;

public class UserVO {
	private String name;
	private String tel;
	private String id;
	private String pwd;

	public UserVO() {
	}
	
	public UserVO(String name, String tel, String id, String pwd) {
		this.name = name;
		this.tel = tel;
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
