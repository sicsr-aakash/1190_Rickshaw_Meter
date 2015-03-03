package com.example.quiz;

import com.example.navigationdrawerexample.CreateFragment;
import com.example.navigationdrawerexample.GlobalClass;
import com.example.navigationdrawerexample.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FinalExpense extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View rootView = inflater.inflate(R.layout.final_exp, container, false);
		
		final TextView fare=(TextView) rootView.findViewById(R.id.fare);
		final GlobalClass g=new GlobalClass();
		
		Button ok=(Button) rootView.findViewById(R.id.ok);
		OnClickListener okay=new OnClickListener(){

			@Override
			public void onClick(View v) 
			{
				CreateFragment yFragment=new CreateFragment();
				getActivity().setTitle("Home");
				getFragmentManager().beginTransaction().replace(R.id.content_frame, yFragment).commit();
			}
		};
		ok.setOnClickListener(okay);
		
		return rootView;
	}

}
