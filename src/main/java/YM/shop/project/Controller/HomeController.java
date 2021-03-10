package YM.shop.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/view")
public class HomeController {
	@GetMapping("/")
	public String details() {
		return "Frontend/index";
	}
	@GetMapping("/login")
	public String login() {
		return "Frontend/login";
	}
	@GetMapping("/register")
	public String register() {
		return "Frontend/register";
	}
	@GetMapping("/shop")
	public String shop() {
		return "Frontend/shop";
	}
	@GetMapping("/blog")
	public String blog() {
		return "Frontend/blog";
	}
	@GetMapping("/contact")
	public String contact() {
		return "Frontend/contact";
	}
	@GetMapping("/checkout")
	public String checkout() {
		return "Frontend/check-out";
	}
}
