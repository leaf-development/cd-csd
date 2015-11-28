package uk.co.leafdevelopment.cdcsd.features.steps.client;

import feign.Param;
import feign.RequestLine;

public interface CdCsd {

	@RequestLine("GET /hello?name={name}")
	String sayHello(@Param("name") String name);

}
