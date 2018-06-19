package mansopresk.firebase.com.weatherapp.POJO;

/**
 * Created by Shaik on 05-10-2017.
 */




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Clouds
{



        @SerializedName("all")
        @Expose
        private long all;

        public long getAll()
        {
            return all;
        }

        public void setAll(long all)
        {
            this.all = all;
        }
}
