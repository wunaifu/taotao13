package com.taotao.activemq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SpringActivemq {

//	//浣跨敤jsmTemplate 鍙戦�佹秷鎭�
//	@Test
//	public void testJmsTemplate() throws Exception {
//		//鍒濆鍖杝pring瀹瑰櫒
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");
//		//浠庡鍣ㄤ腑鑾峰緱JmsTemplate瀵硅薄
//		JmsTemplate jmsTemplate = applicationContext.getBean(JmsTemplate.class);
//		//浠庡鍣ㄤ腑鑾峰緱Destination瀵硅薄
//		Destination destination = (Destination) applicationContext.getBean("test-queue");
//		//鍙戦�佹秷鎭�
//		jmsTemplate.send(destination, new MessageCreator() {
//			
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				TextMessage message = session.createTextMessage("spring activemq send queue message");
//				return message;
//			}
//		});
//		
//	}
}
