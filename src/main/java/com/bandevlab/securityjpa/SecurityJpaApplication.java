package com.bandevlab.securityjpa;

import com.bandevlab.securityjpa.model.Post;
import com.bandevlab.securityjpa.model.User;
import com.bandevlab.securityjpa.repository.PostRepository;
import com.bandevlab.securityjpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJpaApplication.class, args);
	}

        @Bean
        CommandLineRunner commandLineRunner(PostRepository post,UserRepository users,
                PasswordEncoder encoder){
            return args ->{
                
                users.save(new User("user",
                        encoder.encode("123"),
                        "ROLE_USER"));
                
                users.save(new User("admin",
                        encoder.encode("123"),
                        "ROLE_USER,ROLE_ADMIN"));
                
                post.save(new Post("Hello word!","hello","Example",""));
            };
        }
}
