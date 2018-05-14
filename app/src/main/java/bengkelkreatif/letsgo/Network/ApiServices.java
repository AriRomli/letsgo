package bengkelkreatif.letsgo.Network;

import bengkelkreatif.letsgo.response.ResponseRoute;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Abu Azfa on 01/05/2018.
 */

public interface ApiServices {
    //https://maps.googleapis.com/maps/api/directions/
    // json?origin=Cirebon,ID&destination=Jakarta,ID&api_key=YOUR_API_KEY
    @GET("json")
    Call<ResponseRoute> request_route(
            @Query("origin") String origin,
            @Query("destination") String destination,
            @Query("api_key") String api_key
    );
}
