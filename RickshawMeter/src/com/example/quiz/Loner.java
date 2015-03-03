package com.example.quiz;

import com.example.navigationdrawerexample.GlobalClass;
import com.example.navigationdrawerexample.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Loner extends Fragment{
	
	int pos;
	final GlobalClass g = (GlobalClass) getActivity().getApplicationContext();
	Loner(int pos)
	{
		this.pos=pos;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View rootView = inflater.inflate(R.layout.loner, container, false);
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
					getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
				}
				else
				{
					YesNoQues yFragment=new YesNoQues(pos-1);
					getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
				}
			}
			
		};
		b.setOnClickListener(bck);
		
		OnClickListener nxt=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				RadioGroup gr = (RadioGroup) rootView.findViewById(R.id.ynGroup);
				int selected = gr.getCheckedRadioButtonId();
				
				if(selected>=0)
				{
				// Gets a reference to our "selected" radio button
				RadioButton b = (RadioButton) rootView.findViewById(selected);

				// Now you can get the text or whatever you want from the "selected" radio button
				String yn=b.getText().toString();
				if(yn.equals("Loner"))
				{
					
				}
				else
				{
					g.setBaseline((int)(g.getBaseline()/3));
				}	
				Toast.makeText(getActivity(), String.valueOf(g.getBaseline()), Toast.LENGTH_LONG).show();
				
				YesNoQues yFragment=new YesNoQues(pos+1);
				getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
				}
				else
				{
					Toast.makeText(getActivity(), "Select one", Toast.LENGTH_LONG).show();
				}
				
				
			}
			
		};
		n.setOnClickListener(nxt);
		
		return rootView;
		
	}

}
