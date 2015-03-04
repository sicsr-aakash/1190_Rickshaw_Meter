package com.example.navigationdrawerexample;

import com.example.quiz.mQuiz;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View rootView = inflater.inflate(R.layout.calculator, container, false);
		
		final TextView fare=(TextView) rootView.findViewById(R.id.fare);
		final GlobalClass g=new GlobalClass();
		fare.setVisibility(View.GONE);
		Button q=(Button) rootView.findViewById(R.id.back);
		OnClickListener quiz_listn=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (getActivity().findViewById(R.id.content_frame) != null) {
		    		
					Toast.makeText(getActivity(), "Hi",Toast.LENGTH_LONG).show();
		    		HomeFragment firstFragment = new HomeFragment();
		    		//getSupportFragmentManager().beginTransaction().replace(R.id.decider_container,firstFragment).commit();
		    		getFragmentManager().beginTransaction().replace(R.id.content_frame, firstFragment).commit();
		    		
				}
				
			}
			
		};
		q.setOnClickListener(quiz_listn);
		
		Button c=(Button) rootView.findViewById(R.id.cal);
		OnClickListener clistn=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				int time;
				double km;
				EditText t=(EditText) rootView.findViewById(R.id.time);
				EditText k=(EditText) rootView.findViewById(R.id.km);
				if((t.getText().toString()).equals("") || (k.getText().toString()).equals(""))
				{
					Toast.makeText(getActivity(), "Error: Invalid Values", Toast.LENGTH_LONG).show();
				}
				else
				{
					double total;
					time=Integer.parseInt(t.getText().toString());
					km=Double.parseDouble(k.getText().toString().substring(0, 3));
					
					if(time>=0 && km>0d)
					{
						Toast.makeText(getActivity(), String.valueOf(km), Toast.LENGTH_LONG).show();
						for(int i=0;i<g.meters.length;i++)
						{
							if(km==g.meters[i])
							{
								
								total=(g.fare[i])+(time*2);
								int tot = (int) total;
								//Toast.makeText(getActivity(), String.valueOf(tot), Toast.LENGTH_LONG).show();
								fare.setVisibility(View.VISIBLE);
								fare.setText(fare.getText()+" Minimum Fare: Rs."+(tot-5)+"\n Maximum Fare: Rs."+(tot+5));
							}
						}
						
					}
				}
				
			}
			
		};
		c.setOnClickListener(clistn);
		
		return rootView;
	}

}
