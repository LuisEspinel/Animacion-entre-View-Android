package com.example.luisespinel.animacionviews;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvPrincipal,tvSecundario;
    private Button btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.tvPrincipal=(TextView)findViewById(R.id.tvPrincipal);
        this.tvSecundario=(TextView)findViewById(R.id.tvSecundario);
        this.btnAnim=(Button)findViewById(R.id.btnAnimado);

        Animation animacion= AnimationUtils.loadAnimation(this,R.anim.traslacion_derecha);
        animacion.setFillAfter(true);

        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.translacion_izquierda);
        animacion2.setFillAfter(true);

        //Animation rotacion= AnimationUtils.loadAnimation(this,R.anim.rotacion);
        //rotacion.setFillAfter(true);

        //Animation dilatacion= AnimationUtils.loadAnimation(this,R.anim.dilatacion);
        //dilatacion.setFillAfter(true);

        Animation desaparecer= AnimationUtils.loadAnimation(this,R.anim.desaparecer);
        desaparecer.setFillAfter(true);

        desaparecer.setRepeatMode(Animation.REVERSE);
        desaparecer.setRepeatCount(3);
        this.tvPrincipal.startAnimation(animacion);
        this.tvSecundario.startAnimation(animacion2);
        this.btnAnim.startAnimation(desaparecer);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
