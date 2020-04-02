package fr.uvsq.exrcice4_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Before;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Personnel perso1;
    	Personnel perso2;
    	Personnel perso3;
    	Personnel perso4;
    	
    	CompositePersonnels grp1;
    	CompositePersonnels grp2;
    	CompositePersonnels grp3;
    	
    	
    
    		
    		perso1= new Personnel.Builder(2, "a", "b",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    		perso2= new Personnel.Builder(7, "c", "d",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    		perso3= new Personnel.Builder(5, "e", "f",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    		
    		perso4=new Personnel.Builder(6, "g", "h",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    		
    		grp1 = new CompositePersonnels(1);
    		grp2 = new CompositePersonnels(3);
    		grp3 = new CompositePersonnels(4);
    		grp1.addPersonnel(perso1);
    		grp1.addPersonnel(grp2);
    		
    		grp2.addPersonnel(grp3);
    		grp2.addPersonnel(perso3);
    		
    		grp3.addPersonnel(perso4);
    		grp3.addPersonnel(perso2);
    		
    		AffichageParGroup affich = new AffichageParGroup(grp1);
    		Iterator grouptIter = affich.getIterator();
    		InterfacePersonnel nexValue=grouptIter.next();
    		System.out.print("hasnest"+grouptIter.hasNext()+"ok " +nexValue);
    		while (grouptIter.hasNext()) {
                //String nextValue = iterator.next();
    			InterfacePersonnel nextValue=grouptIter.next();
                //System.out.println("The next value with Iterator is: " + nextValue.toString());
    		}
    		}
}
