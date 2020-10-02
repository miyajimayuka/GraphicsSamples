package jp.ac.shohoku.s19b712.graphicssamples;

//import android.content.Context;
//import android.util.AttributeSet;
//import android.view.View;

//import androidx.annotation.Nullable;

//public class CustomView1 extends View {
    //public CustomView1(Context context) {
        //super(context);
    //}

    //public CustomView1(Context context, @Nullable AttributeSet attrs) {
        //super(context, attrs);
    //}

    //public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        //super(context, attrs, defStyleAttr);
    //}

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by  on 2015/10/05.
 * Android 端末でグラフィックス表示をするためのサンプルです．
 */
public class CustomView1 extends View {
    //コンストラクタ 1
    public CustomView1(Context context) {
        super(context);
    }
    //コンストラクタ 2
    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //コンストラクタ 3
    public CustomView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * このメソッドで描画をします．
     * @param canvas 画像表示用のキャンバス
     */
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        int w = this.getWidth();
        int h = this.getHeight();
        Paint p = new Paint();
        p.setStyle(Style.STROKE); //Style を設定: 線で描く
        p.setColor(Color.DKGRAY); //色を設定
        canvas.drawRect(new Rect(10, 10, w - 50, h - 50), p); //長方形を描画
        for(int i = 0; i<10; i++){
            Paint p2 = new Paint();
            p2.setStyle(Style.FILL); //Style を設定： 塗りつぶす
            p2.setColor(Color.rgb(25*i, 0, 0)); //色を設定
            canvas.drawCircle(25*i+125, 25*i+125, 100,p2); //円を描く
        }
    }

}

}
