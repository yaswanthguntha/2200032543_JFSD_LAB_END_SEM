package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SpringMVC")
public class ClientController 
{
	@GetMapping("/greet")
	public ModelAndView greet(@RequestParam("username")  String name)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("greet");
		mv.addObject("name", name);
		return mv;
	}
	
	@GetMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("about");
		return mv;
	}
	
	@GetMapping("/demo1")
	public ModelAndView demo1(@RequestParam("age")  double age,@RequestParam("country")  String country)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("demo1");
		mv.addObject("age", age);
		mv.addObject("country", country);
		return mv;
	}
	
	@GetMapping("/demo2/{a}/{b}")
	@ResponseBody
	public String demo2(@PathVariable("a")  int x,@PathVariable("b") int y)
	{
		int c = x - y;
		double d = x / y;
		
		return "Multiplication="+Integer.toString(c)+"\n"+"Division="+Double.toString(d);
	}
	
	@GetMapping("/productform")
	public ModelAndView productform()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product");
		return mv;
	}
	
	@GetMapping("/multiplyNumbers")
	public ModelAndView multiplyNumbers(@RequestParam("num1")  int a,@RequestParam("num2")  int b)
	{
		ModelAndView mv = new ModelAndView();
		int c = a*b;
		mv.setViewName("demo3");
		mv.addObject("result", c);
		return mv;
	}
	
	@GetMapping("/reverse")
	public ModelAndView reverse(@RequestParam("str1")  String a,@RequestParam("str2")  String b)
	{
		ModelAndView mv = new ModelAndView();
		String c = new StringBuilder(a).reverse().toString();
		String d = new StringBuilder(b).reverse().toString();
		
		mv.setViewName("reverse");
		mv.addObject("str1", c);
		mv.addObject("str2", d);
		return mv;
	}
	
	@GetMapping("/calculate")
	public ModelAndView calculate(@RequestParam("num1")  int a,@RequestParam("num2")  int b)
	{
		ModelAndView mv = new ModelAndView();
		int c = a - b;
		int d = a + b;
		mv.setViewName("calculate");
		mv.addObject("sub", c);
		mv.addObject("add", d);
		return mv;
	}
}
