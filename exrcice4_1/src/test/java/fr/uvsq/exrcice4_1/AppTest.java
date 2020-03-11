package fr.uvsq.exrcice4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Before
	
    @Test
    public void testApp()
    {
		Personnel p1;
		Personnel p2;
		Personnel p3;
		Personnel p4;
		CompositePersonnels cp1;
		InterfacePersonnel intr ;
		p1= new Personnel.Builder(0, "aa", "jj",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		p2= new Personnel.Builder(0, "bb", "kk",LocalDate.parse("1990-08-01",DateTimeFormatter.ISO_DATE)).build();
		p3= new Personnel.Builder(0, "cc", "ll",LocalDate.parse("1998-09-01",DateTimeFormatter.ISO_DATE)).build();
		p4= new Personnel.Builder(0, "dd", "nn",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
				 
		
		
		
    	
    }
}
