package com.self.viewtoglrendering;

import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

import com.self.viewtoglrendering.cuberenerer.CubeGLRenderer;


public class MainActivity extends ActionBarActivity {

    private GLSurfaceView mGLSurfaceView;
    private GLWebView mGLWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    private void initViews() {
        setContentView(R.layout.activity_main);

        ViewToGLRenderer viewToGlRenderer = new CubeGLRenderer(this);

        mGLSurfaceView = (GLSurfaceView) findViewById(R.id.gl_surface_view);
        mGLWebView = (GLWebView) findViewById(R.id.glWebView);

        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(viewToGlRenderer);

        mGLWebView.setViewToGLRenderer(viewToGlRenderer);
        mGLWebView.setWebViewClient(new WebViewClient());
        mGLWebView.setWebChromeClient(new WebChromeClient());
        mGLWebView.loadUrl("http://stackoverflow.com/questions/12499396/is-it-possible-to-render-an-android-view-to-an-opengl-fbo-or-texture");
    }


}
