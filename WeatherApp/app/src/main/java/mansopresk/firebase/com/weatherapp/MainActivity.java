package mansopresk.firebase.com.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuPresenter;
import android.widget.TextView;

import mansopresk.firebase.com.weatherapp.POJO.Main;
import mansopresk.firebase.com.weatherapp.POJO.Model;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity
{
    TextView city, status, humidity, pressure;
    String url = "http://samples.openweathermap.org/data/2.5";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city = (TextView) findViewById(R.id.txt_city);
        status = (TextView) findViewById(R.id.txt_status);
        humidity = (TextView) findViewById(R.id.txt_humidity);
        pressure = (TextView) findViewById(R.id.txt_press);

        //making object of RestAdapter
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint(url).build();

        //Creating Rest Services
        RestInterface restInterface = adapter.create(RestInterface.class);


        restInterface.getWhetherReport(new Callback<Main>() {
                                           @Override
                                           public void success(Main main, Response response)
                                           {
                                            //  humidity.setText("humidity :"+ Main.getHumidity());
                                               //pressure.setText("pressure :"+ Main.getPressure());
                                               //city.setText("Temperature :"+ Main.getTempMin());
Main m=new Main();



                                           //    humidity.setText("humidity :"+ m.getHumidity());
// Long l=m.getHumidity();

                                         //      String Hum=String.valueOf(l);
//                                               humidity.setText(Hum);

                                             //  hum.setText("humidity :"+ m.getHumidity();
                                               pressure.setText("pressure :"+String.valueOf( m.getPressure()));
                                               humidity.setText("humidity :"+String.valueOf( m.getHumidity()));

                                           }

                                           @Override
                                           public void failure(RetrofitError error)
                                           {

                                           }
                                       });



       /* {
            @Override
            public void success(Model model, Response response)
            {
             //   city.setText("city :"+model.getWind());
                status.setText("Status :"+model.getWeather().get(0).getDescription());
           //     humidity.setText("humidity :"+ Main.getHumidity());
             //   pressure.setText("pressure :"+ Main.getPressure());


            }

            @Override
            public void failure(RetrofitError error)
            {

                String merror = error.getMessage();


            }
        });*/




    }
}
