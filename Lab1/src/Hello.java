public class Hello {
	public static void greet(String name) {
		 System.out.println("Привет, " + name + "!");
	}
 	public static void main(String[] args) {
		 if (args.length > 0) {
			 int count = 0;
			 do {
				 greet(args[count]);
				 count++;
			 } while (count != args.length);
		 } else {
			 greet("мир");
		 }
	}
}
