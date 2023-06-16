package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

	@GetMapping("/input")
	public String getInput(Model model) {

		model.addAttribute("inputmsg", "メッセージを入力してください。");

		return "input";
	}

}