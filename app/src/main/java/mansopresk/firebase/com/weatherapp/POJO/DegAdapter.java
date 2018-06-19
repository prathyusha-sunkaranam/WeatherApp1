package mansopresk.firebase.com.weatherapp.POJO;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a8017.tutorial.R;

import java.util.List;

import mansopresk.firebase.com.weatherapp.MainActivity;

/**
 * Created by Mansopresk01 on 10/26/2017.
 */

public class DegAdapter extends RecyclerView.Adapter<DegAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView time,Degree;

        public ViewHolder(View itemView)
        {
            super(itemView);
            time=(TextView)itemView.findViewById(R.id.time_Label);
            Degree=(TextView)itemView.findViewById(R.id.Degree_label);
        }
    }

    List<ApiResponseList> recordList;
    MainActivity mainactivty;

    public DegAdapter(List<ApiResponseList> recordList, MainActivity mainActivity)
    {
        this.recordList = recordList;
        this.mainactivty=mainActivity;
    }
    @Override
    public DegAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.time_deg_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.Degree.setText(String.valueOf(recordList.get(position).wind.getDeg()));
        holder.time.setText(String.valueOf(recordList.get(position).getDt_txt()));


    }

    @Override
    public int getItemCount() {
        return recordList.size() ;
    }


}
