package library;

import java.util.List;

public interface User {
	public void insertUser(UserVO us);
	public UserVO readUser(String id);
	public List<UserVO> listUser();
}


