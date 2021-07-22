package com.example.chat_me;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.chat_me.model.ChatModel;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class Reservation_Activity extends AppCompatActivity {

    private TextView toolbar_txt;
    private TextView name;
    private TextView age;
    private TextView car;
    private CardView chat;

    private String accompany;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        toolbar_txt.setText("예약 상세");
        name = (TextView)findViewById(R.id.reservation_text_name);
        age = (TextView)findViewById(R.id.reservation_text_age);
        car = (TextView)findViewById(R.id.reservation_text_car);
        chat = (CardView)findViewById(R.id.reservation_cardview_chat);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatModel chatModel = new ChatModel();
                chatModel.uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
                chatModel.accompany = accompany;

                FirebaseDatabase.getInstance().getReference().child("chatrooms").push().setValue(chatModel);
            }
        });

    }
}