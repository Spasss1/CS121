import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class StudentXML {

    public static void main(String[] args) {
        try {
            // Load XML file
            File xmlFile = new File("student_record.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Get root element
            Element rootElement = doc.getDocumentElement();
            System.out.println("Root Element: " + rootElement.getNodeName());

            // Get student elements
            NodeList studentList = doc.getElementsByTagName("student");

            for (int i = 0; i < studentList.getLength(); i++) {
                Node studentNode = studentList.item(i);

                if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) studentNode;

                    // Get attributes
                    String id = studentElement.getAttribute("id");
                    System.out.println("\nStudent ID: " + id);

                    // Get child elements
                    String firstName = studentElement.getElementsByTagName("firstname").item(0).getTextContent();
                    String lastName = studentElement.getElementsByTagName("lastname").item(0).getTextContent();
                    String major = studentElement.getElementsByTagName("major").item(0).getTextContent();
                    String gpa = studentElement.getElementsByTagName("gpa").item(0).getTextContent();

                    // Print details
                    System.out.println("First Name: " + firstName);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("Major: " + major);
                    System.out.println("GPA: " + gpa);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
