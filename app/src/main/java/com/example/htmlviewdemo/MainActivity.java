package com.example.htmlviewdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.sufficientlysecure.htmltextview.HtmlHttpImageGetter;
import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import org.sufficientlysecure.htmltextview.OnClickATagListener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String htmlTxt = "<div class=\"post-body post-content\">\n" +
                "<p></p><div class=\"separator\" style=\"clear: both; text-align: center;\"><a href=\"https://1.bp.blogspot.com/-VEH3QriVjEE/YFoGUS_volI/AAAAAAAAX3U/Av9BlJ14JyEu84ttUMuoVv7VK86GC7UkgCLcBGAsYHQ/s1024/5d99e2a6526661030af89d598fa9faba.png\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img border=\"0\" data-original-height=\"1024\" data-original-width=\"1024\" height=\"320\" src=\"https://1.bp.blogspot.com/-VEH3QriVjEE/YFoGUS_volI/AAAAAAAAX3U/Av9BlJ14JyEu84ttUMuoVv7VK86GC7UkgCLcBGAsYHQ/s320/5d99e2a6526661030af89d598fa9faba.png\" class=\"lazy-yard\"></a></div><br><div class=\"separator\" style=\"clear: both; text-align: center;\"><a href=\"https://1.bp.blogspot.com/-Mw0NMZSzYO0/YFoGUecVwUI/AAAAAAAAX3Q/gxtxYxWe8C8KLrO-xucEx0X5NeGRvFpXgCLcBGAsYHQ/s1241/39a984a0be9777d6f47434fcb167ba18.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img border=\"0\" data-original-height=\"1200\" data-original-width=\"1241\" src=\"https://1.bp.blogspot.com/-Mw0NMZSzYO0/YFoGUecVwUI/AAAAAAAAX3Q/gxtxYxWe8C8KLrO-xucEx0X5NeGRvFpXgCLcBGAsYHQ/s320/39a984a0be9777d6f47434fcb167ba18.jpg\" width=\"320\" class=\"lazy-yard\"></a></div><br><div class=\"separator\" style=\"clear: both; text-align: center;\"><a href=\"https://1.bp.blogspot.com/-qbGvv9GAbhg/YFoGUX9-4uI/AAAAAAAAX3Y/pnUidNom_UkE0aA4so1lk5Pn8MIIhjOggCLcBGAsYHQ/s660/902bb8da69ea1c854f7d180ac727f30f.jpg\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img border=\"0\" data-original-height=\"585\" data-original-width=\"660\" src=\"https://1.bp.blogspot.com/-qbGvv9GAbhg/YFoGUX9-4uI/AAAAAAAAX3Y/pnUidNom_UkE0aA4so1lk5Pn8MIIhjOggCLcBGAsYHQ/s320/902bb8da69ea1c854f7d180ac727f30f.jpg\" width=\"320\" class=\"lazy-yard\"></a></div><br><div class=\"separator\" style=\"clear: both; text-align: center;\"><a href=\"https://1.bp.blogspot.com/-Zbkh6V9-GUw/YFoGVBwmLWI/AAAAAAAAX3c/pSYN-J8jcKwyG0-hvn5FHNKUN-pg5fvZwCLcBGAsYHQ/s1428/d7djql9-2609d644-24f3-470c-9b00-c8ef6206d07d.png\" imageanchor=\"1\" style=\"margin-left: 1em; margin-right: 1em;\"><img border=\"0\" data-original-height=\"1361\" data-original-width=\"1428\" src=\"https://1.bp.blogspot.com/-Zbkh6V9-GUw/YFoGVBwmLWI/AAAAAAAAX3c/pSYN-J8jcKwyG0-hvn5FHNKUN-pg5fvZwCLcBGAsYHQ/s320/d7djql9-2609d644-24f3-470c-9b00-c8ef6206d07d.png\" width=\"320\" class=\"lazy-yard\"></a></div><br>&nbsp;<p></p>\n" +
                "</div>";
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        // loads html from string and displays cat_pic.png from the app's drawable folder
        htmlTextView.setHtml(htmlTxt, new HtmlHttpImageGetter(htmlTextView));
        htmlTextView.setPadding(75,50,75,50);
        htmlTextView.setOnClickATagListener(new OnClickATagListener() {

            @Override
            public boolean onClick(View widget, String spannedText, @Nullable String href) {
                Toast.makeText(MainActivity.this, href, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}