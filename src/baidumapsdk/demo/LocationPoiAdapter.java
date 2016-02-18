package baidumapsdk.demo;

import java.util.ArrayList;
import java.util.zip.Inflater;

import com.baidu.mapapi.search.core.PoiInfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class LocationPoiAdapter extends BaseAdapter {
	
	Context context;
	ArrayList<PoiInfo> datas;
	
	public LocationPoiAdapter(Context context, ArrayList<PoiInfo> datas) {
		this.context = context;
		this.datas = datas;
	}
	
	@Override
	public int getCount() {
		return datas.size();
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		ViewHolder viewHolder;
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(R.layout.item_poi, null);
			viewHolder = new ViewHolder();
			viewHolder.addressTV = (TextView) convertView.findViewById(R.id.addressTV);
			convertView.setTag(viewHolder);
		}	
		else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.addressTV.setText(datas.get(position).address+""+datas.get(position).name);
		return convertView;
	}

	class ViewHolder
	{
		TextView addressTV;
	}
}
