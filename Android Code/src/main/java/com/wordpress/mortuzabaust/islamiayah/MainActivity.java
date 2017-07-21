package com.wordpress.mortuzabaust.islamiayah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView ayah, translate, location;
    String jsonAyah = "", jsonTranslate = "", jsonLocation = "";
    String myUrl = "http://172.17.0.96/islami_app/api.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayah = (TextView) findViewById(R.id.ayah);
        translate = (TextView) findViewById(R.id.translation);
        location = (TextView) findViewById(R.id.location);
        fatchingData();
    }

    void fatchingData() {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(myUrl, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                try {
                    JSONObject jsonObject = (JSONObject) response.get(0);
                    jsonAyah = jsonObject.getString("ayah");
                    jsonTranslate = jsonObject.getString("translate");
                    jsonLocation = jsonObject.getString("location");

                    VolleyLog.d(jsonAyah);
                    VolleyLog.d(jsonTranslate);
                    VolleyLog.d(jsonLocation);

                    ayah.setText(jsonAyah);
                    translate.setText(jsonTranslate);
                    location.setText(jsonLocation);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Something Wrong");
            }
        });
        com.wordpress.mortuzabaust.islamiayah.AppControler.getInstance().addToRequestQueue(jsonArrayRequest);
    }
}
