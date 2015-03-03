package com.example.funfacts;

import java.util.List;
import com.example.navigationdrawerexample.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FFAdapter extends ArrayAdapter<FunFacts>{
	
	private List<FunFacts> items;
    View v;
    
    public FFAdapter(Context context, List<FunFacts> items) {
        super(context, R.layout.ff_main, items);
        this.items = items;
    }
    
    @Override
    public int getCount() {
        return items.size();
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        v = convertView;
        
        if(v == null) {
            LayoutInflater li = LayoutInflater.from(getContext());
            v = li.inflate(R.layout.ff_items,null);  
            //v.getLayoutParams().width=LayoutParams.WRAP_CONTENT;
           }
        
        FunFacts app = items.get(position);
        
        if(app != null) {
            TextView hName = (TextView)v.findViewById(R.id.ffHead);
            TextView funfact=(TextView)v.findViewById(R.id.ffMain);
            
            if(hName != null)
            {
            	hName.setText(app.getFactHeading());
            } 
            if(funfact != null)
            {
            	funfact.setText(app.getFact());
            } 
        }
        
        return v;
    }

}
