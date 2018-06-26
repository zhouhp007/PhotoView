package com.demo.photo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.demo.photo.photo.PhotoLayout;
import com.demo.photo.photo.PhotoModel;
import com.demo.photo.util.GlideUtil;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image = findViewById(R.id.image);
        final ImageView image2 = findViewById(R.id.image2);
        final ImageView image3 = findViewById(R.id.image3);

        GlideUtil.loadImageSimple(this, image, "http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
        GlideUtil.loadImageSimple(this, image2, "https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
        GlideUtil.loadImageSimple(this, image3, "http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");

        image.setOnClickListener(view -> {

            final ArrayList<ImageModel> list = new ArrayList<>();
            final ImageModel imageModel1 = new ImageModel();
            imageModel1.setUrl("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            imageModel1.setUrlLittle("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            list.add(imageModel1);
            final ImageModel imageModel2 = new ImageModel();
            imageModel2.setUrl("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            imageModel2.setUrlLittle("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            list.add(imageModel2);
            final ImageModel imageModel3 = new ImageModel();
            imageModel3.setUrl("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            imageModel3.setUrlLittle("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            list.add(imageModel3);

            new PhotoLayout.Builder(MainActivity.this)
                    .setPhotoLongPressSave(false)
                    .setPhotoOpenTransAnim(true)
                    .setPhotoBackgroundColor(Color.BLACK)
                    .setPhotoDefaultPosition(0)
                    .setPhotoDefaultResource(R.mipmap.ic_launcher)
                    .setPhotoViewList(image, image2, image3)
                    .setPhotoModelList(list)
                    .show();
        });

        image2.setOnClickListener(v -> {
            final ArrayList<ImageModel> list = new ArrayList<>();
            final ImageModel imageModel1 = new ImageModel();
            imageModel1.setUrl("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            imageModel1.setUrlLittle("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            list.add(imageModel1);
            final ImageModel imageModel2 = new ImageModel();
            imageModel2.setUrl("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            imageModel2.setUrlLittle("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            list.add(imageModel2);
            final ImageModel imageModel3 = new ImageModel();
            imageModel3.setUrl("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            imageModel3.setUrlLittle("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            list.add(imageModel3);

            new PhotoLayout.Builder(MainActivity.this)
                    .setPhotoLongPressSave(false)
                    .setPhotoOpenTransAnim(true)
                    .setPhotoBackgroundColor(Color.BLACK)
                    .setPhotoDefaultPosition(1)
                    .setPhotoDefaultResource(R.mipmap.ic_launcher)
                    .setPhotoViewList(image, image2, image3)
                    .setPhotoModelList(list)
                    .show();
        });

        image3.setOnClickListener(view -> {

            final ArrayList<ImageModel> list1 = new ArrayList<>();
            final ImageModel imageModel11 = new ImageModel();
            imageModel11.setUrl("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            imageModel11.setUrlLittle("http://scimg.jb51.net/allimg/160905/2-160Z51P540H0.gif");
            list1.add(imageModel11);
            final ImageModel imageModel21 = new ImageModel();
            imageModel21.setUrl("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            imageModel21.setUrlLittle("https://b-ssl.duitang.com/uploads/item/201511/18/20151118131629_RenHN.thumb.700_0.jpeg");
            list1.add(imageModel21);
            final ImageModel imageModel31 = new ImageModel();
            imageModel31.setUrl("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            imageModel31.setUrlLittle("http://img-download.pchome.net/download/1k0/h1/4j/o4jbrz-fkz.jpg@0e_0o_1024w_768h_90q.src");
            list1.add(imageModel31);

            new PhotoLayout.Builder(MainActivity.this)
                    .setPhotoLongPressSave(false)
                    .setPhotoOpenTransAnim(true)
                    .setPhotoBackgroundColor(Color.BLACK)
                    .setPhotoDefaultPosition(2)
                    .setPhotoDefaultResource(R.mipmap.ic_launcher)
                    .setPhotoViewList(image, image2, image3)
                    .setPhotoModelList(list1)
                    .show();
        });
    }

    final class ImageModel implements PhotoModel {

        private String url;
        private String urlLittle;

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUrlLittle(String urlLittle) {
            this.urlLittle = urlLittle;
        }

        @Override
        public String getUrl() {
            return url;
        }

        @Override
        public String getUrlLittle() {
            return urlLittle;
        }
    }
}
