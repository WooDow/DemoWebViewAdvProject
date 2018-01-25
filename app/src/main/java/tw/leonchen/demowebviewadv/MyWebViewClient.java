package tw.leonchen.demowebviewadv;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient{

    private ProgressDialog dialog;

    public MyWebViewClient(Context context){
        dialog = new ProgressDialog(context, ProgressDialog.STYLE_SPINNER);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        dialog.setTitle("Page Loading");
        dialog.setIcon(android.R.drawable.ic_dialog_info);
        dialog.setMessage("Please Wait.");
        dialog.show();
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        dialog.cancel();
    }
}
