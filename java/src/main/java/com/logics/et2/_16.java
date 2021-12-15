package com.logics.et2;

class Teacher {
	void teach(String student) {
	}

}

public class _16 extends Teacher {
	
	public void teach() throws Exception {}
	
	private void teach(int i) throws Exception {}
	
//	protected void teach(String s) {} // no error
	
	public final void teach(String s) {} // overidden method can be final
	
//	public abstract void teach(String s); // class must be abstract, else compile error
}
