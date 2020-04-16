package Base;

import java.util.Random;

public interface IBus {
        public String getFormattedRoute();
        
        public default String generateRandomTransportNumber() {
        	Random random = new Random();
        	
        	String result = "";
        	result = random.ints(48, 122)
		            .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
		            .mapToObj(i -> (char) i)
		            .limit(8)
		            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
		            .toString();
        	
        	return result;
        }
}

