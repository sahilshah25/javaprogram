package IteratorDesignPattern;

import java.util.ArrayList;

public class UserManagement {
	ArrayList<User> UserList=new ArrayList<>();
	
	public void addUser(User user) {
		UserList.add(user);
	}
	
	public User getUser(int index) {
		return UserList.get(index);
	}
	
	
	public MyIterator getIterator() {
		return new MyIteratorImpl(UserList);
	}


}
