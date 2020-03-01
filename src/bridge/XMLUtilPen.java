package bridge;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtilPen {
	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args){
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse("src/bridge/config.xml");
			NodeList nl=null;
			Node classNode=null;
			String cName=null;
			nl = doc.getElementsByTagName("className");
			if(args.equals("color")){
				//获取包含类名的文件节点
				classNode = nl.item(0).getFirstChild();
			}
			else if(args.equals("pen")){
				//获取包含类名的文件节点
				classNode = nl.item(1).getFirstChild();
			}
			cName=classNode.getNodeValue();
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (DOMException | ClassNotFoundException | InstantiationException | IllegalAccessException
				| ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
