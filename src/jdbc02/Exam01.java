package jdbc02;

import java.io.Serializable;

public abstract class Exam01 implements Serializable {
	public abstract String getId();
	public String getName(){return null;}
	public abstract String getPass();
	public String getEmail(){return null;}
	public int getNumber(){return -1;}
	public abstract void setId(String id);
	public void setName(String name){}
	public abstract void setPass(String pass);
	public void setEmail(String email){}
	public void setNumber(int number){}
	
}

