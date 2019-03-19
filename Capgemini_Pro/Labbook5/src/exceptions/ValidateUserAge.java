package exceptions;
class ValidateUserAge{
	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		System.out.println("Enter age of user to be validated");
		scanner = new java.util.Scanner(System.in);
		int age = scanner.nextInt();
		try{
			if(age < 15)
				throw new AgeException(age);
			System.out.println("Age is validated");
		}catch(AgeException e){
			System.out.println(e);
		}
	}
}
class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
AgeException(int age){
	this.age = age;
}
@Override
public String toString(){
	return "This is error of age " + this.age + " being low";
}

}