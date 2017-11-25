package com.taotao.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;
import org.junit.Test;

public class TestActiveMq {

//	//queue
//	//Producer
//	@Test
//	public void testQueueProducer() throws Exception {
//		//1.鍒涘缓涓�涓繛鎺ュ伐鍘傚璞onnectionFactory瀵硅薄銆傞渶瑕佹寚瀹歮q鏈嶅姟鐨刬p鍙婄鍙�
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.168:61616");
//		//2.浣跨敤ConnectionFactory鍒涘缓涓�涓繛鎺onnection瀵硅薄
//		Connection connection = connectionFactory.createConnection();
//		//3.寮�鍚繛鎺ャ�傝皟鐢–onnection瀵硅薄鐨剆tart鏂规硶
//		connection.start();
//		//4.浣跨敤Connection瀵硅薄鍒涘缓涓�涓猄ession瀵硅薄
//		//绗竴涓弬鏁版槸鏄惁寮�鍚簨鍔★紝涓�鑸笉浣跨敤浜嬪姟銆備繚璇佹暟鎹殑鏈�缁堜竴鑷达紝鍙互浣跨敤娑堟伅闃熷垪瀹炵幇銆�
//		//濡傛灉绗竴涓弬鏁颁负true锛岀浜屼釜鍙傛暟鑷姩蹇界暐銆傚鏋滀笉寮�鍚簨鍔alse锛岀浜屼釜鍙傛暟涓烘秷鎭殑搴旂瓟妯″紡銆備竴鑸嚜鍔ㄥ簲绛斿氨鍙互銆�		
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		//5.浣跨敤Session瀵硅薄鍒涘缓涓�涓狣estination瀵硅薄锛屼袱绉嶅舰寮弎ueue銆乼opic銆傜幇鍦ㄥ簲璇ヤ娇鐢╭ueue
//		//鍙傛暟灏辨槸娑堟伅闃熷垪鐨勫悕绉�
//		Queue queue = session.createQueue("test-queue");
//		//6.浣跨敤Session瀵硅薄鍒涘缓涓�涓狿roducer瀵硅薄
//		MessageProducer producer = session.createProducer(queue);
//		//7.鍒涘缓涓�涓猅extMessage瀵硅薄
//		/*TextMessage textMessage = new ActiveMQTextMessage();
//		textMessage.setText("hello activemq");*/
//		TextMessage textMessage = session.createTextMessage("hello activemq1111");
//		//8.鍙戦�佹秷鎭�
//		producer.send(textMessage);
//		//9.鍏抽棴璧勬簮
//		producer.close();
//		session.close();
//		connection.close();
//		
//	}
//	
//	@Test
//	public void testQueueConsumer() throws Exception {
//		//鍒涘缓涓�涓繛鎺ュ伐鍘傚璞�
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.168:61616");
//		//浣跨敤杩炴帴宸ュ巶瀵硅薄鍒涘缓涓�涓繛鎺�
//		Connection connection = connectionFactory.createConnection();
//		//寮�鍚繛鎺�
//		connection.start();
//		//浣跨敤杩炴帴瀵硅薄鍒涘缓涓�涓猄ession瀵硅薄
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		//浣跨敤Session鍒涘缓涓�涓狣estination锛孌estination搴旇鍜屾秷鎭殑鍙戦�佺涓�鑷淬��
//		Queue queue = session.createQueue("test-queue");
//		//浣跨敤Session鍒涘缓涓�涓狢onsumer瀵硅薄
//		MessageConsumer consumer = session.createConsumer(queue);
//		//鍚慍onsumer瀵硅薄涓缃竴涓狹essageListener瀵硅薄锛岀敤鏉ユ帴鏀舵秷鎭�
//		consumer.setMessageListener(new MessageListener() {
//			
//			@Override
//			public void onMessage(Message message) {
//				//鍙栨秷鎭殑鍐呭
//				if (message instanceof TextMessage) {
//					TextMessage textMessage = (TextMessage) message;
//					try {
//						String text = textMessage.getText();
//						//鎵撳嵃娑堟伅鍐呭
//						System.out.println(text);
//					} catch (JMSException e) {
//						e.printStackTrace();
//					}
//				}
//				
//			}
//		});
//		//绯荤粺绛夊緟鎺ユ敹娑堟伅
//		/*while(true) {
//			Thread.sleep(100);
//		}*/
//		System.in.read();
//		//鍏抽棴璧勬簮
//		consumer.close();
//		session.close();
//		connection.close();
//	}
//	
//	//topic
//	//Producer
//	@Test
//	public void testTopicProducer() throws Exception {
//		//鍒涘缓涓�涓繛鎺ュ伐鍘傚璞�
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.168:61616");
//		//鍒涘缓杩炴帴
//		Connection connection = connectionFactory.createConnection();
//		//寮�鍚繛鎺�
//		connection.start();
//		//鍒涘缓Session
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		//鍒涘缓Destination锛屽簲璇ヤ娇鐢╰opic
//		Topic topic = session.createTopic("test-topic");
//		//鍒涘缓涓�涓狿roducer瀵硅薄
//		MessageProducer producer = session.createProducer(topic);
//		//鍒涘缓涓�涓猅extMessage瀵硅薄
//		TextMessage textMessage = session.createTextMessage("hello activemq topic");
//		//鍙戦�佹秷鎭�
//		producer.send(textMessage);
//		//鍏抽棴璧勬簮
//		producer.close();
//		session.close();
//		connection.close();
//	}
//	
//	@Test
//	public void testTopicConsumser() throws Exception {
//		//鍒涘缓涓�涓繛鎺ュ伐鍘傚璞�
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.168:61616");
//		//浣跨敤杩炴帴宸ュ巶瀵硅薄鍒涘缓涓�涓繛鎺�
//		Connection connection = connectionFactory.createConnection();
//		//寮�鍚繛鎺�
//		connection.start();
//		//浣跨敤杩炴帴瀵硅薄鍒涘缓涓�涓猄ession瀵硅薄
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		//浣跨敤Session鍒涘缓涓�涓狣estination锛孌estination搴旇鍜屾秷鎭殑鍙戦�佺涓�鑷淬��
//		Topic topic = session.createTopic("test-topic");
//		//浣跨敤Session鍒涘缓涓�涓狢onsumer瀵硅薄
//		MessageConsumer consumer = session.createConsumer(topic);
//		//鍚慍onsumer瀵硅薄涓缃竴涓狹essageListener瀵硅薄锛岀敤鏉ユ帴鏀舵秷鎭�
//		consumer.setMessageListener(new MessageListener() {
//			
//			@Override
//			public void onMessage(Message message) {
//				//鍙栨秷鎭殑鍐呭
//				if (message instanceof TextMessage) {
//					TextMessage textMessage = (TextMessage) message;
//					try {
//						String text = textMessage.getText();
//						//鎵撳嵃娑堟伅鍐呭
//						System.out.println(text);
//					} catch (JMSException e) {
//						e.printStackTrace();
//					}
//				}
//				
//			}
//		});
//		//绯荤粺绛夊緟鎺ユ敹娑堟伅
//		/*while(true) {
//			Thread.sleep(100);
//		}*/
//		System.out.println("topic娑堣垂鑰�3.銆傘�傘��");
//		System.in.read();
//		//鍏抽棴璧勬簮
//		consumer.close();
//		session.close();
//		connection.close();
//	}
}
