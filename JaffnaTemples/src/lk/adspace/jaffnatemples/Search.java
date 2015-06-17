package lk.adspace.jaffnatemples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Search extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);
		
		
		
		final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
		final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
		final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
		//final Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
		
		final EditText editTxt = (EditText) findViewById(R.id.editText1);
		
		Button bu = (Button) findViewById(R.id.button1);
		
		bu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent2 = new Intent(Search.this, Search_result.class);
				intent2.putExtra("from", spinner1.getSelectedItem().toString());
				intent2.putExtra("distance", spinner2.getSelectedItem().toString());
				intent2.putExtra("temple_type", spinner3.getSelectedItem().toString());
				intent2.putExtra("notemples", editTxt.getText().toString());
				
				startActivity(intent2);
				
			}
		});
	
		
	}

	/**
	 * @uml.property  name="search_result"
	 * @uml.associationEnd  inverse="search:lk.adspace.jaffnatemples.Search_result"
	 */
	private Search_result search_result;

	/**
	 * Getter of the property <tt>search_result</tt>
	 * @return  Returns the search_result.
	 * @uml.property  name="search_result"
	 */
	public Search_result getSearch_result() {
		return search_result;
	}

	/**
	 * Setter of the property <tt>search_result</tt>
	 * @param search_result  The search_result to set.
	 * @uml.property  name="search_result"
	 */
	public void setSearch_result(Search_result search_result) {
		this.search_result = search_result;
	}
}
