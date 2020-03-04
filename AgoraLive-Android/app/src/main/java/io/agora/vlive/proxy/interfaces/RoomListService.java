package io.agora.vlive.proxy.interfaces;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface RoomListService {
    @GET("ent/v1/room/page")
    Call<ResponseBody> requestRoomList(@Header("reqId") long reqId, @Header("reqType") int reqType,
                                       @Header("Authorization") String auth, @Query("nextId") int nextId,
                                       @Query("count") int count, @Query("type") int type, @Query("pkState") int pkState);
}
