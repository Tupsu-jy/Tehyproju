/**
 * @author Heini Näppä
 * @version 9.12.2019
 */

package com.example.tehyproju;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.TextView;

public class vinkitView extends AppCompatActivity {

    /**
     * koodi, jolla saadaan näkymään singleton luokkaan listattujen vinkkien otsikko ja sisältö omalla sivullaan (activity_view_vinkit)
     * ohjelma avaa oikean objektin listalta muuttujalla i
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_vinkit);

        Bundle b = getIntent().getExtras();
        int i = b.getInt(vinkit.EXTRA, 0);
        ((TextView)findViewById(R.id.otsikko))
                .setText(vinkkisingle.getInstance().getVinkit(i).getOtsikko());
        ((TextView)findViewById(R.id.teksti))
                .setText(vinkkisingle.getInstance().getVinkit(i).getVinkki());
    }
}
