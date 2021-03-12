public class Hello{
	public static void main(String[] args){
		// This is an unwanted, but staged comment
		String name = "World";
		if(args.length != 0){
			name = args[0];
		}

		System.out.println("Hello, " + name + "!");
	}
}