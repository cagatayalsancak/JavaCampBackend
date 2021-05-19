package eCommerce.core.concretes;

import java.time.Instant;
import java.util.UUID;
import java.util.function.Supplier;

public class GenerateSecureToken {
	
	public String createToken() {
		Supplier<String> tokenSupplier = () -> {

	        StringBuilder token = new StringBuilder();
	        long currentTimeInMilisecond = Instant.now().toEpochMilli();
	        return token.append(currentTimeInMilisecond).append("-")
	                .append(UUID.randomUUID().toString()).toString();
	};

		return tokenSupplier.get();
	}

}
