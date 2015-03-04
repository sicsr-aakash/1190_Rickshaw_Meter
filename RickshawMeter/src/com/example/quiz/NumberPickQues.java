package com.example.quiz;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationdrawerexample.GlobalClass;
import com.example.navigationdrawerexample.R;

public class NumberPickQues extends Fragment {
	
	int pos;
	//final GlobalClass g = (GlobalClass) getActivity().getApplicationContext();
	GlobalClass g = new GlobalClass();
	NumberPickQues(int pos)
	{
		this.pos=pos;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.numbr_pick, container, false);
		TextView q=(TextView) rootView.findViewById(R.id.pques);
		Button b=(Button) rootView.findViewById(R.id.back);
		Button n=(Button) rootView.findViewById(R.id.next);
		
		q.setText(g.qArray[pos]);
		
		final NumberPicker np=
				  (NumberPicker) rootView.findViewById(R.id.val);
				np.setMaxValue(99);
				np.setMinValue(0);
		
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
				
				Toast.makeText(getActivity(), String.valueOf(np.getValue()), Toast.LENGTH_LONG).show();
				
				Places1 yFragment=new Places1(pos+1,getActivity());
				getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
				
			}
			
		};
		n.setOnClickListener(nxt);
		
		return rootView;
		
	}


}
