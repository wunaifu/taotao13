package com.taotao.solrj;

import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

import com.sun.tools.jdi.VoidTypeImpl;

public class TestSolrJ {

//	@Test
//	public void testAddDocument() throws Exception {
//		//鍒涘缓涓�涓猄olrServer瀵硅薄銆傚垱寤轰竴涓狧ttpSolrServer瀵硅薄
//		//闇�瑕佹寚瀹歴olr鏈嶅姟鐨剈rl
//		SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
//		//鍒涘缓涓�涓枃妗ｅ璞olrInputDocument
//		SolrInputDocument document = new SolrInputDocument();
//		//鍚戞枃妗ｄ腑娣诲姞鍩燂紝蹇呴』鏈塱d鍩燂紝鍩熺殑鍚嶇О蹇呴』鍦╯chema.xml涓畾涔�
//		document.addField("id", "123");
//		document.addField("item_title", "娴嬭瘯鍟嗗搧3");
//		document.addField("item_price", 1000);
//		//鎶婃枃妗ｅ璞″啓鍏ョ储寮曞簱
//		solrServer.add(document);
//		//鎻愪氦
//		solrServer.commit();
//	}
//	
//	@Test
//	public void deleteDocumentById() throws Exception {
//		SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
//		solrServer.deleteById("test001");
//		//鎻愪氦
//		solrServer.commit();
//	}
//	
//	@Test
//	public void deleteDocumentByQuery() throws Exception {
//		SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
//		solrServer.deleteByQuery("item_title:娴嬭瘯鍟嗗搧3");
//		solrServer.commit();
//	}
//	
//	@Test
//	public void searchDocumet() throws Exception {
//		//鍒涘缓涓�涓猄olrServer瀵硅薄
//		SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
//		//鍒涘缓涓�涓猄olrQuery瀵硅薄
//		SolrQuery query = new SolrQuery();
//		//璁剧疆鏌ヨ鏉′欢銆佽繃婊ゆ潯浠躲�佸垎椤垫潯浠躲�佹帓搴忔潯浠躲�侀珮浜�
//		//query.set("q", "*:*");
//		query.setQuery("鎵嬫満");
//		//鍒嗛〉鏉′欢
//		query.setStart(0);
//		query.setRows(10);
//		//璁剧疆榛樿鎼滅储鍩�
//		query.set("df", "item_keywords");
//		//璁剧疆楂樹寒
//		query.setHighlight(true);
//		//楂樹寒鏄剧ず鐨勫煙
//		query.addHighlightField("item_title");
//		query.setHighlightSimplePre("<div>");
//		query.setHighlightSimplePost("</div>");
//		//鎵ц鏌ヨ锛屽緱鍒颁竴涓猂esponse瀵硅薄
//		QueryResponse response = solrServer.query(query);
//		//鍙栨煡璇㈢粨鏋�
//		SolrDocumentList solrDocumentList = response.getResults();
//		//鍙栨煡璇㈢粨鏋滄�昏褰曟暟
//		System.out.println("鏌ヨ缁撴灉鎬昏褰曟暟锛�" + solrDocumentList.getNumFound());
//		for (SolrDocument solrDocument : solrDocumentList) {
//			System.out.println(solrDocument.get("id"));
//			//鍙栭珮浜樉绀�
//			Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
//			List<String> list = highlighting.get(solrDocument.get("id")).get("item_title");
//			String itemTitle = "";
//			if (list != null && list.size() >0) {
//				itemTitle = list.get(0);
//			} else {
//				itemTitle = (String) solrDocument.get("item_title");
//			}
//			System.out.println(itemTitle);
//			System.out.println(solrDocument.get("item_sell_point"));
//			System.out.println(solrDocument.get("item_price"));
//			System.out.println(solrDocument.get("item_image"));
//			System.out.println(solrDocument.get("item_category_name"));
//			System.out.println("=============================================");
//		}
//		
//	}
}
