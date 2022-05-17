package com.example.food_app.api;

import com.example.food_app.model.Cart;
import com.example.food_app.model.CartApiResponse;
import com.example.food_app.model.LoginApiResponse;
import com.example.food_app.model.OrderApiResponse;
import com.example.food_app.model.Ordering;
import com.example.food_app.model.ProductApiResponse;
import com.example.food_app.model.RegisterApiResponse;
import com.example.food_app.model.User;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @POST("users/register")
    Call<RegisterApiResponse> createUser(@Body User user);

    @GET("api/login/user")
    Call<LoginApiResponse> logInUser(@Query("mobile") String mobile, @Query("password") String password);

    @PUT("users/info")
    Call<ResponseBody> updatePassword(@Header("authorization") String token, @Query("password") String password, @Query("id") int userId);
    @GET("products")
    Call<ProductApiResponse> getProductsByCategory(@Query("category") String category, @Query("userId") int userId, @Query("page") int page);

    @GET("products/search")
    Call<ProductApiResponse> searchForProduct(@Query("q") String keyword, @Query("userId") int userId);
    @POST("carts/add")
    Call<ResponseBody> addToCart(@Body Cart cart);

    @DELETE("carts/remove")
    Call<ResponseBody> removeFromCart(@Query("userId") int userId, @Query("productId") int productId);

    @GET("carts")
    Call<CartApiResponse> getProductsInCart(@Query("userId") int userId);
    @GET("orders/get")
    Call<OrderApiResponse> getOrders(@Query("userId") int userId);
    @POST("orders/add")
    Call<ResponseBody> orderProduct(@Body Ordering ordering);
}
