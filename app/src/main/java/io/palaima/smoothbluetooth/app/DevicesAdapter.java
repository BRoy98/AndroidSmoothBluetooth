package io.palaima.smoothbluetooth.app;


import android.support.v7.widget.RecyclerView;
import com.palaima.bluetooth.app.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.palaima.smoothbluetooth.Device;

public class DevicesAdapter extends RecyclerView.Adapter<DevicesAdapter.ViewHolder> {

    private final Context mContext;
    private final List<Device> mDevices;

    public DevicesAdapter(Context context, List<Device> devices) {
        this.mContext = context;
        this.mDevices = devices;
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_device, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mMacTV.setText(mDevices.get(position).getAddress());
        holder.mNameTV.setText(mDevices.get(position).getName());

    }
    @Override
    public int getItemCount() {
        return mDevices.size();
    }

    /*@Override
    public int getCount() {
        return mDevices.size();
    }

    @Override
    public Object getItem(int position) {
        return mDevices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = convertView;
        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.list_device, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        Device device = mDevices.get(position);
        holder.mNameTV.setText(device.getName());
        holder.mMacTV.setText(device.getAddress());

        return view;*/



    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mNameTV;
        TextView mMacTV;

        private ViewHolder(View view) {
            super(view);
            mNameTV = view.findViewById(R.id.nameTV);
            mMacTV = view.findViewById(R.id.macTV);
        }
    }
}
