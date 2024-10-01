package ie.atu.week3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/message")
    public String getMessage()
    {

        return "some message";
    }

    @GetMapping("/details")
        public String getDetails()
    {
            return "some other message";
        }

        @GetMapping("/hello")
        public String message()
        {
        return "hello";
        }

        @GetMapping("/greet/{name}")
      public String greetByName(@PathVariable String name){
        return "hello" + name;
        }
}


