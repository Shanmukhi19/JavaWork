package com.refer.xmltojava;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class DomParser {
	public static void main(String args[]) {
		try{
			DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
		    DocumentBuilder b=f.newDocumentBuilder();
			Document d=b.parse("C:\\Users\\Ravikiran\\Desktop\\breakfast.xml");
			System.out.println("document name:"+d.getDocumentElement().getNodeName());
			NodeList nl=d.getElementsByTagName("food");
			for(int i=0;i<nl.getLength();i++)
			{
			  Node n=nl.item(i);
			  System.out.println("\nNode Name :" + n.getNodeName());
			  if(n.getNodeType()==Node.ELEMENT_NODE)
			  {
				  Element e=(Element) n;
				  System.out.println("Food name: "+ e.getElementsByTagName("name").item(0).getTextContent());  
				  System.out.println("price: "+e.getElementsByTagName("price").item(0).getTextContent());  
				  System.out.println("description: "+ e.getElementsByTagName("description").item(0).getTextContent());  
				  System.out.println("calories "+ e.getElementsByTagName("calories").item(0).getTextContent());  
			 }
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
