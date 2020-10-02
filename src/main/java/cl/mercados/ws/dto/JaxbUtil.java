package cl.mercados.ws.dto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class JaxbUtil {

	public static void validar(byte[] bytes) throws Exception {
		// TODO Auto-generated method stub
		try {
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(JaxbUtil.class.getResource("/WEB-INF/xsd/ws/ws_v10.xsd"));
			Validator validator = schema.newValidator();
			Source source = new StreamSource(new ByteArrayInputStream(bytes));
			validator.validate(source);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}
	
	public static void validar(final Class<?> klass, final Object dto) {
		try {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final JAXBContext jc = JAXBContext.newInstance(new Class[] { klass });
			final Marshaller ma = jc.createMarshaller();
			ma.marshal(dto, baos);
			baos.flush();
			baos.close();
			validar(baos.toByteArray());
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}	
	
}
