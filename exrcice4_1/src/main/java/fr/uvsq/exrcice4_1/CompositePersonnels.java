package fr.uvsq.exrcice4_1;

import java.util.ArrayList;
import java.util.List;


public class CompositePersonnels implements InterfacePersonnel {
    int id;
	List<InterfacePersonnel> listperso= new ArrayList<InterfacePersonnel>();
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.print(id);
		for(InterfacePersonnel pres:listperso ) {
			pres.print();
		}
	}

}
