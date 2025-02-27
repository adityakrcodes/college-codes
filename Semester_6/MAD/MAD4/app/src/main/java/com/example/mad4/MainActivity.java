package com.example.mad4;
import android.app.Activity;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280,
                Bitmap.Config.ARGB_8888);
        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);
        //Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setTextSize(50);
        Paint paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setTextSize(50);
        paint1.setFakeBoldText(true);
        canvas.drawText("Rectangle", 420, 150, paint1);
        canvas.drawRect(400, 200, 650, 700, paint);
        canvas.drawText("Circle", 120, 150, paint1);
        canvas.drawCircle(200, 350, 150, paint);
        canvas.drawText("Oval", 130, 590, paint1);
        canvas.drawOval(50, 600, 350, 1000, paint);
        canvas.drawText("Line", 480, 800, paint1);
        canvas.drawLine(520, 850, 520, 1150, paint);
    }
}