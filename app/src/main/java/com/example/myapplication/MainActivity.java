package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ImageView image = (ImageView) findViewById(R.id.arms);
        if (image.getVisibility() == View.VISIBLE) {
            System.out.println("joe");
            outState.putBoolean("arms", true);
        } else {
            System.out.println("slet");
            outState.putBoolean("arms", false);
        }
        ImageView image1 = (ImageView) findViewById(R.id.shoes);
        if (image1.getVisibility() == View.VISIBLE) {
            outState.putBoolean("shoes", true);
        } else {
            outState.putBoolean("shoes", false);
        }
        ImageView image2 = (ImageView) findViewById(R.id.hat);
        if (image2.getVisibility() == View.VISIBLE) {
            outState.putBoolean("hat", true);
        } else {
            outState.putBoolean("hat", false);
        }
        ImageView image3 = (ImageView) findViewById(R.id.body);
        if (image3.getVisibility() == View.VISIBLE) {
            outState.putBoolean("body", true);
        } else {
            outState.putBoolean("body", false);
        }
        ImageView image4 = (ImageView) findViewById(R.id.ears);
        if (image4.getVisibility() == View.VISIBLE) {
            outState.putBoolean("ears", true);
        } else {
            outState.putBoolean("ears", false);
        }
        ImageView image5 = (ImageView) findViewById(R.id.eyebrows);
        if (image5.getVisibility() == View.VISIBLE) {
            outState.putBoolean("eyebrows", true);
        } else {
            outState.putBoolean("eyebrows", false);
        }
        ImageView image6 = (ImageView) findViewById(R.id.glasses);
        if (image6.getVisibility() == View.VISIBLE) {
            outState.putBoolean("glasses", true);
        } else {
            outState.putBoolean("glasses", false);
        }
        ImageView image7 = (ImageView) findViewById(R.id.mouth);
        if (image7.getVisibility() == View.VISIBLE) {
            outState.putBoolean("mouth", true);
        } else {
            outState.putBoolean("mouth", false);
        }
        ImageView image8 = (ImageView) findViewById(R.id.nose);
        if (image8.getVisibility() == View.VISIBLE) {
            outState.putBoolean("nose", true);
        } else {
            outState.putBoolean("nose", false);
        }
        ImageView image9 = (ImageView) findViewById(R.id.eyes);
        if (image9.getVisibility() == View.VISIBLE) {
            outState.putBoolean("eyes", true);
        } else {
            outState.putBoolean("eyes", false);
        }
        ImageView image10 = (ImageView) findViewById(R.id.mustache);
        if (image10.getVisibility() == View.VISIBLE) {
            outState.putBoolean("mustache", true);
        } else {
            outState.putBoolean("mustache", false);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        boolean checkedBox = inState.getBoolean("arms");
        boolean checkedBox1 = inState.getBoolean("shoes");
        boolean checkedBox2 = inState.getBoolean("hat");
        boolean checkedBox3 = inState.getBoolean("body");
        boolean checkedBox4 = inState.getBoolean("ears");
        boolean checkedBox5 = inState.getBoolean("eyebrows");
        boolean checkedBox6 = inState.getBoolean("glasses");
        boolean checkedBox7 = inState.getBoolean("mouth");
        boolean checkedBox8 = inState.getBoolean("nose");
        boolean checkedBox9 = inState.getBoolean("eyes");
        boolean checkedBox10 = inState.getBoolean("mustache");
        if (checkedBox){
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.arms);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox1){
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.shoes);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox2){
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.hat);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox3){
            ImageView image = (ImageView) findViewById(R.id.body);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.body);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox4){
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.ears);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox5){
            ImageView image = (ImageView) findViewById(R.id.eyebrows);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.eyebrows);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox6){
            ImageView image = (ImageView) findViewById(R.id.glasses);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.glasses);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox7){
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.mouth);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox8){
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.nose);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox9){
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.eyes);
            image.setVisibility(View.INVISIBLE);
        }
        if (checkedBox10){
            ImageView image = (ImageView) findViewById(R.id.mustache);
            image.setVisibility(View.VISIBLE);
        }else{
            ImageView image = (ImageView) findViewById(R.id.mustache);
            image.setVisibility(View.INVISIBLE);
        }
    }

    public void checkClicked(android.view.View view) {
        // Is the view now checked?
        CheckBox checkbox = (CheckBox) view;
        boolean checked = checkbox.isChecked();
        // Check which checkbox was clicked
        if (checked) {
            String cbtext = checkbox.getText().toString();
            if (cbtext.equals("arms")){
                ImageView image = (ImageView) findViewById(R.id.arms);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("shoes")) {
                ImageView image = (ImageView) findViewById(R.id.shoes);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("hat")) {
                ImageView image = (ImageView) findViewById(R.id.hat);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("body")){
                ImageView image = (ImageView) findViewById(R.id.body);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("ears")) {
                ImageView image = (ImageView) findViewById(R.id.ears);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("eyebrows")) {
                ImageView image = (ImageView) findViewById(R.id.eyebrows);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("glasses")) {
                ImageView image = (ImageView) findViewById(R.id.glasses);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("mouth")) {
                ImageView image = (ImageView) findViewById(R.id.mouth);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("nose")) {
                ImageView image = (ImageView) findViewById(R.id.nose);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("eyes")) {
                ImageView image = (ImageView) findViewById(R.id.eyes);
                image.setVisibility(view.VISIBLE);
            }
            if (cbtext.equals("mustache")) {
                ImageView image = (ImageView) findViewById(R.id.mustache);
                image.setVisibility(view.VISIBLE);
            }
        }
        else {
            String cbtext = checkbox.getText().toString();
            if (cbtext.equals("arms")) {
                ImageView image = (ImageView) findViewById(R.id.arms);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("shoes")) {
                ImageView image = (ImageView) findViewById(R.id.shoes);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("hat")) {
                ImageView image = (ImageView) findViewById(R.id.hat);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("body")) {
                ImageView image = (ImageView) findViewById(R.id.body);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("ears")) {
                ImageView image = (ImageView) findViewById(R.id.ears);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("eyebrows")){
                ImageView image = (ImageView) findViewById(R.id.eyebrows);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("glasses")) {
                ImageView image = (ImageView) findViewById(R.id.glasses);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("mouth")) {
                ImageView image = (ImageView) findViewById(R.id.mouth);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("nose")) {
                ImageView image = (ImageView) findViewById(R.id.nose);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("eyes")) {
                ImageView image = (ImageView) findViewById(R.id.eyes);
                image.setVisibility(view.INVISIBLE);
            }
            if (cbtext.equals("mustache")) {
                ImageView image = (ImageView) findViewById(R.id.mustache);
                image.setVisibility(view.INVISIBLE);
            }
        }
    }

}