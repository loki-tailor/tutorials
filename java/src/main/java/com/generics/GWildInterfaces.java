package com.generics;

import java.util.List;
import java.util.ArrayList;

interface SuperInterface {}
interface ParentInterface extends SuperInterface {}
interface ChildInterface extends ParentInterface {}

public class GWildInterfaces implements ChildInterface {
	public static void main(String[] args) {
		
		List<ParentInterface> pi_pi = new ArrayList<ParentInterface>();
		List<ParentInterface> pi_g = new ArrayList<>();

		// List<ParentInterface> 		pi_ci 	= new ArrayList<ChildInterface>(); // error
		List<? extends ParentInterface> 	aep_ci 	= new ArrayList<ChildInterface>();
		// List<? extends ParentInterface> 	aep_si 	= new ArrayList<SuperInterface>(); // error
		List<? extends ParentInterface> 	aep_tis = new ArrayList<GWildInterfaces>();
		List<? extends ParentInterface> 	aep_pi 	= new ArrayList<ParentInterface>();
		

		// List<? super ParentInterface> asp_ci = new ArrayList<ChildInterface>(); // error
		List<? super ParentInterface> asp_si 	= new ArrayList<SuperInterface>();
		// List<? super ParentInterface> asp_tis= new ArrayList<GWildInterfaces>(); // error
		List<? super ParentInterface> asp_pi 	= new ArrayList<ParentInterface>();
		
	}
}