package com.example.navigationdrawerexample;

import com.example.funfacts.FunFacts_Main;
import com.example.quiz.mQuiz;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class CreateFragment extends Fragment {

	
	public CreateFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View rootView = inflater.inflate(R.layout.fragment_create, container, false);

		Button q=(Button) rootView.findViewById(R.id.mquizbtn);
		OnClickListener quiz_listn=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (getActivity().findViewById(R.id.content_frame) != null) {
		    		
					Toast.makeText(getActivity(), "Hi",Toast.LENGTH_LONG).show();
		    		mQuiz firstFragment = new mQuiz();
		    		getActivity().setTitle("Monthly Quiz");
		    		//getSupportFragmentManager().beginTransaction().replace(R.id.decider_container,firstFragment).commit();
		    		getFragmentManager().beginTransaction().replace(R.id.content_frame, firstFragment).commit();
		    		
				}
				
			}
			
		};
		q.setOnClickListener(quiz_listn);
		
		Button c=(Button) rootView.findViewById(R.id.calc);
		OnClickListener clistn=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (getActivity().findViewById(R.id.content_frame) != null) {
		    		
					Toast.makeText(getActivity(), "Hi",Toast.LENGTH_LONG).show();
		    		Calculator firstFragment = new Calculator();
		    		//getSupportFragmentManager().beginTransaction().replace(R.id.decider_container,firstFragment).commit();
		    		getFragmentManager().beginTransaction().replace(R.id.content_frame, firstFragment).commit();
		    		
				}
				
			}
			
		};
		c.setOnClickListener(clistn);
		
		
		Button f=(Button) rootView.findViewById(R.id.ffbtn);
		OnClickListener ff=new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if (getActivity().findViewById(R.id.content_frame) != null) {
		    		
					Toast.makeText(getActivity(), "Hi",Toast.LENGTH_LONG).show();
		    		FunFacts_Main firstFragment = new FunFacts_Main();
		    		getActivity().setTitle("Fun Facts");
		    		//getSupportFragmentManager().beginTransaction().replace(R.id.decider_container,firstFragment).commit();
		    		getFragmentManager().beginTransaction().replace(R.id.content_frame, firstFragment).commit();
		    		
				}
				
			}
			
		};
		f.setOnClickListener(ff);
		
		return rootView;
	}

}
