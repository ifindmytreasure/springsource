package com.atguigu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Arrays;

/**
 * Created by Unruly Wind on 2019/3/21/021.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Aspect
public class LogAspects {
	@Autowired
	private Environment environment;

	@Pointcut("execution(public * com.atguigu.aop.MathCalculator.*(..))")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		Object[] objects = joinPoint.getArgs();
		System.out.println(Arrays.asList(objects) + joinPoint.getSignature().getName() + "logStart......");
	}

	@After("pointCut()")
	public void logEnd(JoinPoint joinPoint) {
		System.out.println("logEnd......");
	}

	@AfterReturning(value = "pointCut()", returning = "object")
	public void logReturn(Object object) {
		System.out.println("logReturn.....");
	}

	@AfterThrowing(value = "pointCut()", throwing = "exception")
	public void logException(JoinPoint joinPoint, Exception exception) {
		System.out.println("" + joinPoint.getSignature().getName() + "异常。。。异常信息：{" + exception.getMessage() + "}");
	}
}
