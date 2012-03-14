package main;

public class Driver {
	
	private int hello;
	private int world;
	/**
	 * @param args
	 */
	
	public int getHello(){
		return hello;
	}
	
	public int getWorld(){
		return world;
	}
	
	public Driver(){
		hello = 5;
		world = -3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver someObj = new Driver();
		
		System.out.println("Testing git ... ");
		System.out.print("Make changes to the code");
		System.out.print("Hello equals: ");
		System.out.println(someObj.getHello());
		System.out.print("World equals: ");
		System.out.println(someObj.getWorld());
		System.out.println("Good Bye");
	}

}
