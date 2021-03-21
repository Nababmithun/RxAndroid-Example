package com.example.simplerxandroidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;


public class MainActivity extends AppCompatActivity {


    private TextView Txt;
    private Observable<String> mObservable;
    private Observer<String> mObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txt=findViewById(R.id.textt);

        mObservable = Observable.just("Hello RxJava ");
        mObserver=new Observer<String>() {
           @Override
           public void onSubscribe(@NonNull Disposable d) {

           }

           @Override
           public void onNext(@NonNull String s) {

               Txt.setText(s);
           }

           @Override
           public void onError(@NonNull Throwable e) {

           }

           @Override
           public void onComplete() {

           }
       };

    }

    public void Subscribe(View view) {


        mObservable.subscribe(mObserver);
    }
}