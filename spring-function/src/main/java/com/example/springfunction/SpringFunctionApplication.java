package com.example.springfunction;

import com.example.springfunction.pojo.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.internal.Function;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
@Slf4j
public class SpringFunctionApplication {
	
	@Bean
	public Function<Flux<String>, Flux<String>> uppercase() {
		return flux -> flux.map(value -> value.toUpperCase());
	}
	@Bean
	public Supplier<Flux<Foo>> words() {
		return () -> Flux.fromArray(new Foo[]{new Foo("foo"), new Foo("bar")}).log();
	}
	
	@Bean
	public Function<Foo, List> word() {
		return ss -> {
			log.info("调用word成功，入参: "+ss.toString());
			return Arrays.asList(ss.getValue().split(","));
		};
	}
	
	@Bean
	public Function<Flux<String>, Flux<String>> lowerCase() {
		return flux -> flux.map(value -> value.toLowerCase());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringFunctionApplication.class, args);
	}

}
