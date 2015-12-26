package mvp_master.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import mvp_master.view.GiftRainView;

public class MainActivity extends AppCompatActivity {

    private GiftRainView giftRainView;
    private boolean isStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giftRainView = (GiftRainView) findViewById(R.id.dropview);
        giftRainView.setImages(R.mipmap.ico_money, R.mipmap.ico_gold_money);
        startRain();
        giftRainView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isStart) {
                    stopRain();
                } else {
                    startRain();
                }
            }
        });
    }


    private void startRain() {
        giftRainView.startRain();
        isStart = true;
    }

    private void stopRain() {
        giftRainView.stopRainDely();
        isStart = false;
    }


}
