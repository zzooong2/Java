package OptionalPractice;

import java.util.Optional;

public class StringOptional {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("대한"));
		Optional<String> os2 = Optional.ofNullable(new String("민국"));
		
		if(os1.isPresent())
			System.out.println(os1.get());
		
		if(os2.isPresent())
			System.out.println(os2.get());

	}

}
