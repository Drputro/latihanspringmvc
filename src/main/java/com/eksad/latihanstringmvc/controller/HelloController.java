package com.eksad.latihanstringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //
public class HelloController {

	@RequestMapping("/hello") //untuk mapping url
	@ResponseBody //untuk menampilkan fungsi yang telah dibuat
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("/myName")
	@ResponseBody
	public String myName(@RequestParam String myName) {//untuk request parameternya
		return "Hello "+ myName;
	}

	@RequestMapping("/namaSaya/{myName}")
	@ResponseBody
	public String namaSaya(@PathVariable String myName) {//untuk request parameter dengan slash
		return "Hello "+ myName;
	}

	@RequestMapping("/toGoogle")
	@ResponseBody
	public String toGoogle() {//untuk request parameternya
		return "<a href='https://www.youtube.com' target='_blank'> klik dsini to youtube </a>"
				+"</br> <a href='https://www.instagram.com' target='_blank'> klik dsini to instagram </a>";
	}
}
