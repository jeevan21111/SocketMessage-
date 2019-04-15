/*
package com.example.ytech.socketfinalimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.emitter.Emitter;

public class NewActivity extends AppCompatActivity {
    public Button button;
    public TextView text;
    public EditText edit;
    private io.socket.client.Socket mSocket;

    {
        try {
            mSocket = IO.socket("http://192.168.1.4:3000");
            mSocket.connect();
//            Log.e("connection", mSocket.connect())

        } catch (URISyntaxException e) {
            Log.d("myTag", e.getMessage());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        edit = findViewById(R.id.edit);
        mSocket.connect();
        text.setText("");

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String message = edit.getText().toString().trim();
                edit.setText("");
                if (!message.isEmpty()) {
                    //send message
                    String jsonString = "{message: " + "'" + message + "'" + "}";

                    try {
                        JSONObject jsonData = new JSONObject(jsonString);
                        mSocket.emit("CHAT", jsonData);
                        Log.e("me", String.valueOf(jsonData));

                    } catch (JSONException e) {
                        Log.e("me", "error send message " + e.getMessage());
                    }
                }
            }
        });//button.setOnClickListener

        mSocket.on("CHAT", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                try {
                    JSONObject messageJson = new JSONObject(args[0].toString());
                    final String message = messageJson.getString("message");
                    text.setText(message);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            //  mMessageAdapter.notifyDataSetChanged();
                            Toast.makeText(getApplicationContext(), "Your toast message. " + message, Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }//on create


    @Override
    protected void onDestroy() {
        super.onDestroy();

//        mSocket.disconnect();
//        mSocket.off("new message", "coonnection loss");
    }
}//end of class
*/
