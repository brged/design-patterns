package factorymethod;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtil {
	
	public static Object getBean(){
		
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse("src/factorymethod/config.xml");
			
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String className = classNode.getNodeValue().trim();
			
			//通过类名生成实例对象并返回
			Class c = Class.forName(className);
			Object obj = c.newInstance();
			
			return obj;
		} catch (DOMException | ClassNotFoundException | InstantiationException | IllegalAccessException
				| ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
