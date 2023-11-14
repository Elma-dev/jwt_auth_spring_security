package dev_elma;

import dev_elma.entities.AppRole;
import dev_elma.entities.AppUser;
import dev_elma.repositories.AppRoleRepository;
import dev_elma.repositories.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class JwtAuthSpringSecurityApplication  implements CommandLineRunner {
	private AppRoleRepository appRoleRepository;
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthSpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List.of("ADMIN","USER","BILL MANAGER").forEach(r->appRoleRepository.save(AppRole.builder().roleName(r).build()));
		List.of("user1","admin1","admin2","manger1","user2").forEach(u->appUserRepository.save(AppUser.builder().username(u).password("1234").build()));
	}
}
