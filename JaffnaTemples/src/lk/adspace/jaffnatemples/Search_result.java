package lk.adspace.jaffnatemples;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;

@SuppressLint("CutPasteId")
public class Search_result extends Activity {
	
	
	
	@SuppressLint("CutPasteId")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchresult);
		
		
		final TextView tv1 = (TextView) findViewById(R.id.from1);
		tv1.setText(getIntent().getExtras().getString("from"));
		
		final TextView tv2 = (TextView) findViewById(R.id.textView2);
		tv2.setText(getIntent().getExtras().getString("distance"));
		
		final TextView tv3 = (TextView) findViewById(R.id.textView3);
		tv3.setText(getIntent().getExtras().getString("temple_type"));
		
		final TextView tv4 = (TextView) findViewById(R.id.textView4);
		tv4.setText(getIntent().getExtras().getString("notemples"));
		
		
		
		
		
				Button bu = (Button) findViewById(R.id.button1);
				bu.setOnClickListener(new OnClickListener() {
					
				@Override
				public void onClick(View v) {
					
	
					Intent intent3 = new Intent(Search_result.this, Db_results.class);
					intent3.putExtra("from", tv1.getText().toString());
					intent3.putExtra("distance", tv2.getText().toString());
					intent3.putExtra("temple_type", tv3.getText().toString());
					intent3.putExtra("notemples", tv4.getText().toString());
					
					
					
					startActivity(intent3);
					}
				});
	}

	/**
	 * @uml.property  name="dbhandler"
	 * @uml.associationEnd  inverse="search_result:lk.adspace.jaffnatemples.Dbhandler"
	 */
	private Dbhandler dbhandler;

	/**
	 * Getter of the property <tt>dbhandler</tt>
	 * @return  Returns the dbhandler.
	 * @uml.property  name="dbhandler"
	 */
	public Dbhandler getDbhandler() {
		return dbhandler;
	}

	/**
	 * Setter of the property <tt>dbhandler</tt>
	 * @param dbhandler  The dbhandler to set.
	 * @uml.property  name="dbhandler"
	 */
	public void setDbhandler(Dbhandler dbhandler) {
		this.dbhandler = dbhandler;
	}

	/**
	 * @uml.property  name="search"
	 * @uml.associationEnd  inverse="search_result:lk.adspace.jaffnatemples.Search"
	 */
	private Search search;

	/**
	 * Getter of the property <tt>search</tt>
	 * @return  Returns the search.
	 * @uml.property  name="search"
	 */
	public Search getSearch() {
		return search;
	}

	/**
	 * Setter of the property <tt>search</tt>
	 * @param search  The search to set.
	 * @uml.property  name="search"
	 */
	public void setSearch(Search search) {
		this.search = search;
	}
	
	
	
	
	

	
	
	
}
