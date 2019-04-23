package com.atguigu.config;

import com.atguigu.aop.LogAspects;
import com.atguigu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Unruly Wind on 2019/3/21/021.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {
	@Bean
	public MathCalculator mathCalculator() {
		return new MathCalculator();
	}

	@Bean
	public LogAspects logAspects() {
		return new LogAspects();
	}
}
