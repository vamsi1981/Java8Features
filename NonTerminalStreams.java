

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonTerminalStreams {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("ONE");
		stringList.add("TWO");
		stringList.add("THREE");
		    
		Stream<String> stream = stringList.stream();
		    
		Stream<String> stringStream =
		    stream.map((value) -> { return value.toLowerCase(); });
		
		List<String> lst = stringStream.collect(Collectors.toList());
		for(String numbers:lst)
		{
			System.out.println(numbers);
		}
}
}
