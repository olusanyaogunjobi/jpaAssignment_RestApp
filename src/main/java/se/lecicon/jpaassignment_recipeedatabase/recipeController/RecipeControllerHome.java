package se.lecicon.jpaassignment_recipeedatabase.recipeController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.lecicon.jpaassignment_recipeedatabase.model.Recipe;

@RestController
public class RecipeControllerHome {

    @GetMapping("/home")
    public String helloWorld(){

        return "<h1>Hello World, Message from the Homepage</h1>";
    }

    @GetMapping("/message")
    public ResponseEntity<String> responseEntity(){
        
        return ResponseEntity.status(HttpStatus.OK).body("<h1>The Recipe was Successfully added</h1>");
    }



}
