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
	Personnel personne1;
	Personnel personne2;
	Personnel personne3;
	Personnel personne4;
	CompositePersonnels groupe1;
	CompositePersonnels groupe2;
	CompositePersonnels groupe3;
	
	@Before
	  public void init() {
		
		
		
		
	}

	@Test
	public void test() {
		
		personne1= new Personnel.Builder(2, "a", "b",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		personne2= new Personnel.Builder(7, "c", "d",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		personne3= new Personnel.Builder(5, "e", "f",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		personne4=new Personnel.Builder(6, "g", "h",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		groupe1 = new CompositePersonnels(1);
		groupe2 = new CompositePersonnels(3);
		groupe3 = new CompositePersonnels(4);
		groupe1.addPersonnel(personne1);
		groupe1.addPersonnel(groupe2);
		groupe2.addPersonnel(groupe3);
		groupe2.addPersonnel(personne3);
		groupe3.addPersonnel(personne4);
		groupe3.addPersonnel(personne2);
		
		AffichageParGroup affichage = new AffichageParGroup(groupe1);
		Iterator grouptIter = affichage.getIterator();
		while (grouptIter.hasNext()) {
			InterfacePersonnel nextValue=grouptIter.next();
			
            System.out.println("la valeut suivant est: " + nextValue.toString());
        }
	}
	
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
