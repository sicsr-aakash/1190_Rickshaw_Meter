package com.example.funfacts;

import java.util.ArrayList;
import java.util.List;

import com.example.navigationdrawerexample.GlobalClass;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FunFacts_Main extends ListFragment{
	
	@Override
	   public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
		
				List<FunFacts> apps = new ArrayList<FunFacts>();
				GlobalClass g=new GlobalClass();
				
				for(int i=0;i<g.facts.length;i++)
				{
					FunFacts app=new FunFacts();
					app.setFact(g.facts[i]);
					app.setFactHeading(g.fHeads[i]);
					
					apps.add(app);
				}
				
				FFAdapter adapter = new FFAdapter(getActivity(), apps);
		        // set the adapter to list
		        setListAdapter(adapter);
			   
			   
			   return super.onCreateView(inflater, container, savedInstanceState);
	          //Inflate the layout for this fragment
	          
	  }
	
	

}
