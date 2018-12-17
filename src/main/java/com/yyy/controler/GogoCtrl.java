package com.yyy.controler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.Resource;
import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yyy.model.domain.User;
import com.yyy.service.UserService;

/**
 * 
 * @author Administrator
 * 杩欓噷涔熷彲浠ユ敞瑙ｄ负 @RestController 浣嗘槸灏变笉鑳借繑鍥炴寚瀹氱殑鏄剧ず鐣岄潰鍙兘杩斿洖鍐呭
 * 鑻ョ敤 @Controller 鍙互杩斿洖鎸囧畾鐨勯厤缃晫闈�  鍚屾椂鍦╢unction鍔犱笂@ResponseBody灏卞彲浠ヨ繑鍥炲唴瀹�
 */
@Controller
public class GogoCtrl {

	private static final String defName = "no good , %s!";
	private final AtomicLong id = new AtomicLong();
	
	//@Autowired
	//UserService userService;

	@RequestMapping("/test")
	@ResponseBody
	public User test(@RequestParam(value="name", defaultValue="yyyyyyy") String name) {
		User user = new User();
		user.setUserName("first");
		//userService.addUser(user);
		
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb ");
		System.out.println(name);
		return user;
	}
	
	@RequestMapping("/getAll")
	public List<User> getAll() {
		return null;
		//return userService.getAllUser();
	}
	
	@RequestMapping("/page")
	public String jump() {
		return "result";
	}
	
	@RequestMapping(value="/producer", method = RequestMethod.GET)
	@ResponseBody
	public String producer() {
		System.out.println("ctrl producer " );
		return "producer";
	}
	
}
