package lsl.com.animxmldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView iv;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initLayout();
        // 动画
    }

    private void initLayout() {
        iv = (ImageView) findViewById(R.id.iv);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but1:
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
                iv.startAnimation(animation);
                break;
            case R.id.but2:
                Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
                iv.startAnimation(animation2);
                break;
            case R.id.but3:
                Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
                iv.startAnimation(animation1);
                break;
            case R.id.but4:
                Animation animation3 = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
                iv.startAnimation(animation3);
                break;
            case R.id.but5:
                Animation animation4 = AnimationUtils.loadAnimation(this,R.anim.anim_set);
                iv.startAnimation(animation4);
                break;
        }
    }
}
