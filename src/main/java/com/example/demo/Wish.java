package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service("wish")
//@Component("wish")
public class Wish {
	public String getWish(String name) {
		return "Hello Mr.   "+name;
	}
	public String getGenerate(int sid) {
		return "Hello mr."+sid;
	}
}