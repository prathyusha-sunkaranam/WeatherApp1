package mansopresk.firebase.com.weatherapp;

import android.media.audiofx.AudioEffect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a8017.tutorial.R;

import java.util.List;

import mansopresk.firebase.com.weatherapp.POJO.ApiResponse;
import mansopresk.firebase.com.weatherapp.POJO.ApiResponseList;
import mansopresk.firebase.com.weatherapp.POJO.DegAdapter;
import mansopresk.firebase.com.weatherapp.POJO.MainData;
import mansopresk.firebase.com.weatherapp.POJO.TempAdapter;
import mansopresk.firebase.com.weatherapp.POJO.TextAdapter;
import mansopresk.firebase.com.weatherapp.POJO.Weather;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    String url = "http://samples.openweathermap.org";
     RecyclerView recyclerView,recyclerView1,recyclerView2;
    DegAdapter degAdapter;
    TextAdapter txadapter;
    TempAdapter rvAdapdter;
    List<ApiResponse> recordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_week) ;

        recyclerView1 = (RecyclerView)  findViewById(R.id.recycler_view_day);
        recyclerView2 = (RecyclerView)  findViewById(R.id.recycler_view_text);

        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(url).build();

        RestInterface restInterface = adapter.create(RestInterface.class);

        restInterface.getWhetherReport(new Callback<ApiResponse>() {

            @Override
    public void success(ApiResponse mainData, Response response)
    {
        Toast.makeText(MainActivity.this, "sucess", Toast.LENGTH_LONG).show();


        rvAdapdter=new TempAdapter(mainData.list,MainActivity.this);
        recyclerView.setAdapter(rvAdapdter);
        LinearLayoutManager llm = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);


        degAdapter=new DegAdapter(mainData.list,MainActivity.this);
        recyclerView1.setAdapter(degAdapter);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(horizontalLayoutManager);
        recyclerView1.setHasFixedSize(true);


        txadapter=new TextAdapter(mainData.list,MainActivity.this);
        recyclerView2.setAdapter(txadapter);
        LinearLayoutManager llm2 = new LinearLayoutManager(MainActivity.this);
        recyclerView2.setLayoutManager(llm2);
        recyclerView2.setHasFixedSize(true);


    }


            @Override
    public void failure(RetrofitError error)
            {
        Toast.makeText(MainActivity.this, "Data Retrieving failed", Toast.LENGTH_SHORT).show();
    }
});
        }
        }
