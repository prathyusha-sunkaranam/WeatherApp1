package mansopresk.firebase.com.weatherapp.POJO;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a8017.tutorial.R;

import java.util.List;

import mansopresk.firebase.com.weatherapp.MainActivity;

/**
 * Created by Mansopresk01 on 10/26/2017.
 */

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView temp_label,temp_min_label,temp_max_label,pressure_label,sea_level_label,grnd_level_label,humidity_label,temp_kf_label;

        public ViewHolder(View itemView)
        {
            super(itemView);
            temp_label=(TextView)itemView.findViewById(R.id.temp_value_label);
           temp_min_label = (TextView)itemView.findViewById(R.id.temp_min__value_label);
           temp_max_label = (TextView)itemView.findViewById(R.id.temp_max__value_label);
           pressure_label = (TextView)itemView.findViewById(R.id.pressure__value_label);
           sea_level_label = (TextView)itemView.findViewById(R.id.sea_level__value_label);
            grnd_level_label = (TextView)itemView.findViewById(R.id.grnd_level__value_label);
            humidity_label = (TextView)itemView.findViewById(R.id.humidity__value_label);
            temp_kf_label = (TextView)itemView.findViewById(R.id.temp_kf__value_label);
        }
    }

    List<ApiResponseList> recordList;
    MainActivity mainactivty;

    public TextAdapter(List<ApiResponseList> recordList, MainActivity mainActivity)
    {
        this.recordList = recordList;
        this.mainactivty=mainActivity;
    }
    @Override
    public TextAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.textview_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.temp_label.setText(String.valueOf(recordList.get(position).main.getTemp()));

        holder.temp_min_label.setText(String.valueOf(recordList.get(position).main.getTempMin()));

        holder.temp_max_label.setText(String.valueOf(recordList.get(position).main.getTempMax()));

        holder.pressure_label.setText(String.valueOf(recordList.get(position).main.getPressure()));

        holder.sea_level_label.setText(String.valueOf(recordList.get(position).main.getSeaLevel()));

        holder.grnd_level_label.setText(String.valueOf(recordList.get(position).main.getGrndLevel()));

        holder.humidity_label.setText(String.valueOf(recordList.get(position).main.getHumidity()));

        holder.temp_kf_label.setText(String.valueOf(recordList.get(position).main.getTempKf()));




    }

    @Override
    public int getItemCount() {
        return recordList.size() ;
    }


}
