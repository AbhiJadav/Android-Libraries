package spi.calc;


import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HintAdapter extends ArrayAdapter<String> {

	private Context context;
	
	public HintAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
		this.context=context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView view=(TextView) super.getDropDownView(position, convertView, parent);
		view.setTypeface(MainActivity.tf,Typeface.BOLD);
		view.setTextColor(context.getResources().getColor(R.color.ColorPrimary));
		return view;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		int count= super.getCount();
		return count>0?count-1:count;
	}

}
