package kr.hs.emirim.qls6521.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator12 on 2016. 9. 26..
 */
public class Myimage extends View{
    int choose=MainActivity.ORIGINAL;
    Bitmap picture;

    Myimage(Context context) {
        super(context);
        picture= BitmapFactory.decodeResource(getResources(),R.drawable.iwa);//현재 프로젝트의 리소스불러오기

    }
    public void setChoose(int choose){
        this.choose=choose;
    }

    @Override
    protected void onDraw(Canvas canvas) {//view클래스의 onDraw를 오버라이딩하는 것이다
        super.onDraw(canvas);
        float cx=getWidth()/2.0f;
        float cy=getWidth()/2.0f;
        float x=(getWidth()-picture.getWidth())/2.0f;
        float y=(getHeight()-picture.getHeight())/2.0f;
        switch(choose) {
            case MainActivity.ROTATE:
                canvas.rotate(45, cx, cy);
                break;
            case MainActivity.TRANSLATE:
                canvas.translate(-150, 200);
                break;
            case MainActivity.SCALE:
                canvas.scale(0.5f, 0.5f, cx, cy);
                break;
            case MainActivity.SKEW:
                canvas.skew(0.4f, 0.4f);
                break;
        }
        canvas.drawBitmap(picture, x, y, null);
        //picture.recycle();
    }

}
