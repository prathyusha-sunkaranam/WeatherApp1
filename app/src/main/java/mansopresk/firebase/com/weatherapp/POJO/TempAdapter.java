package mansopresk.firebase.com.weatherapp.POJO;

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
public class TempAdapter extends RecyclerView.Adapter<TempAdapter.personViewHolder>
{

    public static class personViewHolder extends  RecyclerView.ViewHolder
    {



        public TextView Date,speed,deg;

        public personViewHolder(View itemView)
        {
            super(itemView);
            Date=(TextView)itemView.findViewById(R.id.date_label);
            speed=(TextView)itemView.findViewById(R.id.speed_label);
            deg=(TextView)itemView.findViewById(R.id.degree_label);
        }
    }

    List<ApiResponseList> recordList;
    MainActivity mainactivty;

    public TempAdapter(List<ApiResponseList> recordList, MainActivity mainActivity)
    {
        this.recordList = recordList;
        this.mainactivty=mainActivity;
    }






    @Override
    public personViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        // View v = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.list_reservation, parent, false);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.day_item,parent,false);
        personViewHolder pvh = new personViewHolder(view);
        return pvh;
    }

    @Override
    public void onBindViewHolder(personViewHolder holder, int position)
    {

        holder.Date.setText(String.valueOf(recordList.get(position).getDt_txt()));
        holder.speed.setText(String.valueOf(recordList.get(position).wind.getSpeed()));
        holder.deg.setText(String.valueOf(recordList.get(position).wind.getDeg()));
    }

    @Override
    public int getItemCount()
    {
        return recordList.size() ;
    }






}

