package com.tedu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tedu.service.EmpService;

public class TestSpring {
	/**
	 * 使用spring的IOC解决程序中的耦合问题
	 */
	@Test
	public void testIOC() {
		//获取spring的核心容器对象
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		//通过spring的核心容器获取EmpService接口的子类实例
		EmpService service = (EmpService) ac.getBean("empService");

		System.out.println("调用service层的方法添加员工信息...");
		service.addEmp();
	}
}
