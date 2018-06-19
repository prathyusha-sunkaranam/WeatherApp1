package mansopresk.firebase.com.weatherapp.POJO;

/**
 * Created by Shaik on 05-10-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys
{

        @SerializedName("pod")
        private String pod;


        public String getDt_txt()
        {
                return dt_txt;
        }

        public void setDt_txt(String dt_txt)
        {
                this.dt_txt = dt_txt;
        }

        @SerializedName("dt_txt")
        private String dt_txt;

        public String getPod()
        {
            return pod;
        }

        public void setPod(String pod)
        {
            this.pod = pod;
        }
}
