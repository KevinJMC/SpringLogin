package mccann.kevin;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kevinmccann on 2/28/17.
 */
@CrossOrigin
@RestController
public class LoginController {

    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(value="/login", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public boolean submit(@ModelAttribute("user") User user) {
        if(user != null && user.getName() != null & user.getPassword() != null) {
            return (user.getName().equals("Bruce") && user.getPassword().equals("batman"));
        } else {
           return false;
        }
    }
}