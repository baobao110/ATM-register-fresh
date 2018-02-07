package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.inter.MessageDAO;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "/spring-config.xml" })
public class MessageTest {
	
	 @Autowired
	   private MessageDAO dao;

	  
		@Test
		public void testSet() {
			int row=dao.totalNumber(104);
			assertEquals(4,row);
		}
}
