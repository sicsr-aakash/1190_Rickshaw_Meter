package com.example.quiz;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

import com.example.navigationdrawerexample.CreateFragment;
import com.example.navigationdrawerexample.GlobalClass;
import com.example.navigationdrawerexample.R;

public class mQuiz extends Fragment {
	
	
	int q_id=0;
	int count=0;


	public mQuiz() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.monthly_quiz, container, false);
		final LinearLayout opt=(LinearLayout) rootView.findViewById(R.id.opts);
		
		
		
		final Button s=(Button) rootView.findViewById(R.id.start);
		OnClickListener startQ = new OnClickListener(){

			@Override
			public void onClick(View v) 
			{
				opt.setVisibility(View.GONE);
				Places1 yFragment=new Places1(0,getActivity().getApplicationContext());
				getFragmentManager().beginTransaction().replace(R.id.content_frame2, yFragment).commit();
			}
			
		};
		s.setOnClickListener(startQ);
		
		Button b=(Button) rootView.findViewById(R.id.back);
		OnClickListener back = new OnClickListener(){

			@Override
			public void onClick(View v) 
			{
				
				CreateFragment yFragment=new CreateFragment();
				getActivity().setTitle("Home");
				getFragmentManager().beginTransaction().replace(R.id.content_frame, yFragment).commit();
			}
			
		};
		b.setOnClickListener(back);
		
		
		
		return rootView;
	}

}