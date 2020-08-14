package sg.edu.rp.c346.id19037610.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etURL = findViewById(R.id.editTextURL);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = wvMyPage.getSettings();
                //enable javascript execution
                webSettings.setJavaScriptEnabled(true);
                //disable file access within WebView
                webSettings.setAllowFileAccess(false);
                //enable built-in zoom control
                webSettings.setBuiltInZoomControls(true);
                wvMyPage.loadUrl(etURL.getText().toString());
            }
        });
    }
}
