package com.jwt.controller;

import com.jwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.services.Impl.IregisterService;

@CrossOrigin(origins="*")
@RestController
public class registerController {
	
	@Autowired
	IregisterService regservice;
	
	@RequestMapping("/reg")
	public String hello() {

		return "hello";

	}
	
//	@PostMapping("/register/save")
//	public Register add(@RequestBody Register register) throws Exception{
//		String tempEmailId=register.getEmailId();
//		if(tempEmailId !=null && !"".equals(tempEmailId)) {
//			Register regObj=regservice.fetchUserByEmailId(tempEmailId);
//			
//			if(regObj!=null) {
//				throw new  Exception("user with"+tempEmailId+"already exists");
//			}
//		}
//		Register regObj=null;
//		regObj=regservice.add(register);
//		return regObj;
//		
//	}
	
	@PostMapping("/register/save")
	public User add(@RequestBody User user) throws Exception{
		String tempusername=user.getUsername();
		if(tempusername !=null && !"".equals(tempusername)) {
			User regObj=regservice.fetchUserByUsername(tempusername);
			
			if(regObj!=null) {
				throw new  Exception("user with"+tempusername+"already exists");
			}
		}
		User regObj=null;
		regObj=regservice.add(user);
		return regObj;
		
	}
	
//	@PostMapping("/User")
//	public Register UserUser(@RequestBody Register register) throws Exception {
//		String tempEmailId=register.getEmailId();
//		String temppass=register.getPassword();
//		Register regObj=null;
//		if(tempEmailId !=null && temppass !=null) {
//			regObj=regservice.fetchUserByEmailIdAndPassword(tempEmailId, temppass);
//			
//		}
//		if(regObj==null) {
//			throw new  Exception("bad credentials");
//		}
//		
//		return regObj;
//	}
//

}


