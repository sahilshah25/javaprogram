package IteratorDesignPattern;

public class MAin {
	public static void main(String[] args) {
		UserManagement usermang = new UserManagement();
		usermang.addUser(new User("sahil","14"));
		usermang.addUser(new User("ahmad","15"));
		usermang.addUser(new User("shah","16"));
		usermang.addUser(new User("azaan","17"));
		usermang.addUser(new User("nadeem","18"));
		
		
		MyIterator myiterator=usermang.getIterator();
		while(myiterator.hasNext()) {
			User user=(User)myiterator.Next();
			System.out.println(user.getName()+" "+user.getUserId());
		}
		
		
		
	}

}
