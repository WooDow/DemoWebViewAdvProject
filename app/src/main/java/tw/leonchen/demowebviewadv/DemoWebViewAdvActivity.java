package tw.leonchen.demowebviewadv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class DemoWebViewAdvActivity extends AppCompatActivity {

    private EditText et_url;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_web_view_adv);

        et_url = (EditText)findViewById(R.id.et_url);
        webView = (WebView)findViewById(R.id.webView);

        //WebViewClient client = new WebViewClient();
        MyWebViewClient client = new MyWebViewClient(DemoWebViewAdvActivity.this);
        webView.setWebViewClient(client);
    }

    public void processPageAction(View view) {
        String urlStr = et_url.getText().toString();
        webView.loadUrl(urlStr);
    }

    public void processBack(View view) {
        webView.goBack();
    }

    public void processNext(View view) {
        webView.goForward();
    }

    public void processReload(View view) {
        webView.reload();
    }

    public void processClean(View view) {
        et_url.setText("");
    }
}
