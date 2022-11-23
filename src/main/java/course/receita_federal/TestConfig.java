package course.receita_federal;

import course.receita_federal.entities.User;
import course.receita_federal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new course.receita_federal.entities.User(null,35555565L,"Diego",15);
        User u2 = new course.receita_federal.entities.User(null,46666666L,"Steffa",45);
        User u3 = new course.receita_federal.entities.User(null,22222222L,"Joao",29);

        userRepository.saveAll(Arrays.asList(u1,u2,u3));
    }
}
