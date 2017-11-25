package com.taotao.solrj;

import org.apache.solr.client.solrj.impl.CloudSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class TestSolrCloud {

//	@Test
//	public void testSolrCloudAdDocument() throws Exception {
//		//鍒涘缓涓�涓狢loudSolrServer瀵硅薄锛屾瀯閫犳柟娉曚腑闇�瑕佸埗瀹歾ookeeper鐨勫湴鍧�鍒楄〃
//		CloudSolrServer cloudSolrServer = new CloudSolrServer("192.168.25.154:2181,192.168.25.154:2182,192.168.25.154:2183");
//		//闇�瑕佽缃粯璁ょ殑Collection
//		cloudSolrServer.setDefaultCollection("collection2");
//		//鍒涘缓涓�涓枃妗ｅ璞�
//		SolrInputDocument document = new SolrInputDocument();
//		//鍚戞枃妗ｄ腑娣诲姞鍩�
//		document.addField("id", "test001");
//		document.addField("item_title", "娴嬭瘯鍟嗗搧鍚嶇О");
//		document.addField("item_price", 100);
//		//鎶婃枃妗ｅ啓鍏ョ储寮曞簱
//		cloudSolrServer.add(document);
//		//鎻愪氦
//		cloudSolrServer.commit();
//		
//	}
}
