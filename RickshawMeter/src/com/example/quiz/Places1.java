package com.example.quiz;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationdrawerexample.GlobalClass;
import com.example.navigationdrawerexample.R;

public class Places1 extends Fragment {
	
	final GlobalClass g;
	int pos;
	Places1(int pos,Context c)
	{
		this.pos=pos;
		//g = (GlobalClass) getActivity().getApplicationContext();
		g = new GlobalClass();
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View rootView;
		
		if(pos==0)
		{
			rootView = inflater.inflate(R.layout.places, container, false);
		}
		else
		{
			rootView = inflater.inflate(R.layout.places2, container, false);
		}
		
		TextView q=(TextView) rootView.findViewById(R.id.pques);
		Button b=(Button) rootView.findViewById(R.id.back);
		Button n=(Button) rootView.findViewById(R.id.next);
		
		q.setText(g.qArray[pos]);
		
			OnClickListener bck=new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					if(pos==0)
					{
						mQuiz yFragment=new mQuiz();
						getFragmentManager().beginTransaction().replace(R.id.content_frame, yFragment).commit();
					}
					else
					{
						mQuiz yFragment=new mQuiz();
						getFragmentManager().beginTransaction().replace(R.id.content_frame, yFragment).commit();
					}
				}
				
			};
			b.setOnClickListener(bck);
			
			OnClickListener nxt=new OnClickListener(){

				@Override
				public void onClick(View v) {
					
					if(pos==0)
					{
						RadioGroup gr = (RadioGroup) rootView.findViewById(R.id.rGroup); 

						// Returns an integer which represents the selected radio button's ID
						int selected = gr.getCheckedRadioButtonId();
						
						if(selected>=0)
						{
						// Gets a reference to our "selected" radio button
						RadioButton b = (RadioButton) rootView.findViewById(selected);

						// Now you can get the text or whatever you want from the "selected" radio button
						String area=b.getText().toString();
						int a;
						for(int i=0;i<g.areas.length;i++)
							if(area.equals(g.areas[i]))
							{	a=i;
								g.setA(a);
							}
						
						
						
						YesNoQues yFragment=new YesNoQues(pos+1);
						getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
						}
						else
						{
							Toast.makeText(getActivity(), "Select one", Toast.LENGTH_LONG).show();
						}
					}
					else
					{
						int amount=0;
						for(int j=0;j<7;j++)
						{
							int bId = getResources().getIdentifier("a"+j, "id", getActivity().getPackageName());
			            	TextView myText = (TextView) rootView.findViewById(bId);
			            	int travel;
			            	
			            	if(myText.getText().toString().equals(""))
			            	{
			            		travel=0;
			            	}
			            	else
			            	{
			            		travel=Integer.parseInt(myText.getText().toString());
			            		amount=amount+(travel*g.pvalues[j]);
			            	}
			            }
						Toast.makeText(getActivity(), String.valueOf(amount), Toast.LENGTH_LONG).show();
						g.setBaseline((g.getBaseline()+amount));
						
						Loner yFragment=new Loner(pos+1);
						getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
					}
				}
				
			};
			n.setOnClickListener(nxt);
		
		return rootView;
		
	}

}