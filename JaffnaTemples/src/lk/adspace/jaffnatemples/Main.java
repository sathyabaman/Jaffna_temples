package lk.adspace.jaffnatemples;

import com.google.android.gms.maps.GoogleMap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	
	/**
	 * @uml.property  name="mmap"
	 * @uml.associationEnd  readOnly="true"
	 */
	GoogleMap mmap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button bu = (Button) findViewById(R.id.button1);
		bu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(Main.this, Search.class));
		
				
			}
		});
		
	}


}
