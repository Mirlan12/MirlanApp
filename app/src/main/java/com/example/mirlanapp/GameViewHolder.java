package com.example.mirlanapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder {

    private ImageView gameIcon;
    private TextView gameName;
    private TextView gameDescription;

    public GameViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Game game){
    gameIcon = itemView.findViewById(R.id.ImageView);
    gameName = itemView.findViewById(R.id.TextViewOne);
    gameDescription = itemView.findViewById(R.id.TextViewTwo);

        gameIcon.setImageResource(game.image);
    gameName.setText(game.name);
       gameDescription.setText(game.description);
    }
}
