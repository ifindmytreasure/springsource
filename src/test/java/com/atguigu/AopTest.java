package com.atguigu;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.AopConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Unruly Wind on 2019/3/21/021.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class AopTest {
	@Test
	public void test1() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
		mathCalculator.div(1, 1);
		applicationContext.close();
	}
}
