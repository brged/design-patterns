package simplefactory;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtilTV {
	
	public static String getBrandName(){
		
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("src/simplefactory/config.xml"));
			
			NodeList n1=doc.getElementsByTagName("brandName");
			Node classNode = n1.item(0).getFirstChild();
			String brandName = classNode.getNodeValue().trim();
			return brandName;
		} catch (DOMException | ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
