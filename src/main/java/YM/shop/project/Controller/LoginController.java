package YM.shop.project.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import YM.shop.project.Entities.TaiKhoan;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping("/add")
	public String add(ModelMap model) {
		model.addAttribute("taikhoan", new TaiKhoan());
		return "login/addOrEdit";
		
	}
	
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(TaiKhoan taikhoan) {
		return "login/addOrEdit";
		
	}
	
}