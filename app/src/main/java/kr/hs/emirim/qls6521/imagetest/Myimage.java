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
    Myimage(Context context) {
        super(context);//view를 상속받으면 무조건 이 생성자구문이 필요함! default생성자가 없어
    }

    @Override
    protected void onDraw(Canvas canvas) {//view클래스의 onDraw를 오버라이딩하는 것이다
        super.onDraw(canvas);
        Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.iwa);//현재 프로젝트의 리소스불러오기
        float cx=getWidth()/2.0f;
        float cy=getWidth()/2.0f;
        float x=(getWidth()-picture.getWidth())/2.0f;
        float y=(getHeight()-picture.getHeight())/2.0f;
        //canvas.rotate(45,cx,cy);
        //canvas.translate(-150,200);
        canvas.scale(0.5f,0.5f,cx,cy);
        //canvas.skew(0.4f,0.4f);
        canvas.drawBitmap(picture,x,y,null);
    }

}
