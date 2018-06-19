package mansopresk.firebase.com.weatherapp.POJO;

/**
 * Created by Shaik on 05-10-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys
{

        @SerializedName("pod")
        @Expose
        private String pod;

        public String getPod()
        {
            return pod;
        }

        public void setPod(String pod)
        {
            this.pod = pod;
        }
}
