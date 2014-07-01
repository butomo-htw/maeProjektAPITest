package htw.mae.backend;



import htw.mae.dhis2.MapDHIS2;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MapDHIS2Test {
	
	//Map map;
	
	double longitude = -1378543.6774686;
	double latitude = 952175.62553525;
	int zoom = 8;
	
	MapDHIS2 map = new MapDHIS2();
	
	
	@BeforeTest
	public void testMapAttributes() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		map = objectMapper.readValue(new File(System.getProperty("user.dir")+"//testdata//map.json"), MapDHIS2.class);	
	}

	@Test(priority=1)
	public void testMap() {
		Assert.assertNotNull(map);
	}
	
	@Test(priority=2)
	public void getLatitude() {
		Assert.assertEquals(map.getLatitude(), latitude);			
	}
	
	@Test(priority=3)
	public void getLongitude() {
		Assert.assertEquals(map.getLongitude(), longitude);
	}
		
	@Test(priority=4)
	public void getZoom() {
		Assert.assertEquals(map.getZoom(), Integer.valueOf(zoom));
	}
  
}
