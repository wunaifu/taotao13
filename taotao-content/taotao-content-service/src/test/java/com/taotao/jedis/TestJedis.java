package com.taotao.jedis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class TestJedis {

//	@Test
//	public void testJedis() throws Exception {
//		//鍒涘缓涓�涓猨edis瀵硅薄锛岄渶瑕佹寚瀹氭湇鍔＄殑ip鍜岀鍙ｅ彿
//		Jedis jedis = new Jedis("192.168.25.153", 6379);
//		//鐩存帴鎿嶄綔鏁版嵁搴�
//		jedis.set("jedis-key", "1234");
//		String result = jedis.get("jedis-key");
//		System.out.println(result);
//		//鍏抽棴jedis
//		jedis.close();
//	}
//	
//	@Test
//	public void testJedisPool() throws Exception {
//		//鍒涘缓涓�涓暟鎹簱杩炴帴姹犲璞★紙鍗曚緥锛夛紝闇�瑕佹寚瀹氭湇鍔＄殑ip鍜岀鍙ｅ彿
//		JedisPool jedisPool = new JedisPool("192.168.25.153", 6379);
//		//浠庤繛鎺ユ睜涓幏寰楄繛鎺�
//		Jedis jedis = jedisPool.getResource();
//		//浣跨敤Jedis鎿嶄綔鏁版嵁搴擄紙鏂规硶绾у埆浣跨敤锛�
//		String result = jedis.get("jedis-key");
//		System.out.println(result);
//		//涓�瀹氳鍏抽棴Jedis杩炴帴
//		jedis.close();
//		//绯荤粺鍏抽棴鍓嶅叧闂繛鎺ユ睜
//		jedisPool.close();
//	}
//	
//	@Test
//	public void testJedisCluster() throws Exception {
//		//鍒涘缓涓�涓狫edisCluster瀵硅薄锛屾瀯閫犲弬鏁癝et绫诲瀷锛岄泦鍚堜腑姣忎釜鍏冪礌鏄疕ostAndPort绫诲瀷
//		Set<HostAndPort> nodes = new HashSet<>();
//		//鍚戦泦鍚堜腑娣诲姞鑺傜偣
//		nodes.add(new HostAndPort("192.168.25.153", 7001));
//		nodes.add(new HostAndPort("192.168.25.153", 7002));
//		nodes.add(new HostAndPort("192.168.25.153", 7003));
//		nodes.add(new HostAndPort("192.168.25.153", 7004));
//		nodes.add(new HostAndPort("192.168.25.153", 7005));
//		nodes.add(new HostAndPort("192.168.25.153", 7006));
//		JedisCluster jedisCluster = new JedisCluster(nodes);
//		//鐩存帴浣跨敤JedisCluster鎿嶄綔redis锛岃嚜甯﹁繛鎺ユ睜銆俲edisCluster瀵硅薄鍙互鏄崟渚� 鐨勩��
//		jedisCluster.set("cluster-test", "hello jedis cluster");
//		String string = jedisCluster.get("cluster-test");
//		System.out.println(string);
//		//绯荤粺鍏抽棴鍓嶅叧闂璊edisCluster
//		jedisCluster.close();
//	}
}
