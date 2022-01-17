<<<<<<< M01
package com.example.demo.Controller;
=======
package com.example.demo.controller;
>>>>>>> 5d027ef add MyBatis-Read with test method.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
	
	@GetMapping("/top")
	public String getTop() {
	 return "top";
	}

}
