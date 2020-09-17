package library;

import java.util.ArrayList;
import java.util.List;

public class UserImpl implements User {
	private List<UserVO> userList = new ArrayList<UserVO>();

	public UserImpl() {

	}
	
	@Override
	public void insertUser(UserVO us) {
		userList.add(us);

	}

	@Override
	public UserVO readUser(String id) {
		for (UserVO us : userList) {
			if (us.getId().equals(id)) {
				return us;
			}
		}
		return null;
	}

	@Override
	public List<UserVO> listUser() {
		return userList;
	}
}
