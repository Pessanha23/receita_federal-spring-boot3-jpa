package course.receita_federal.resource;


import course.receita_federal.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users2") //trocar esse users
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new course.receita_federal.entities.User(4236258899L,"Joao",29);
        return ResponseEntity.ok().body(u);
    }

}
