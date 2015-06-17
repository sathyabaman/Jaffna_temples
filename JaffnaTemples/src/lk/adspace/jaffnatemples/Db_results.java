package lk.adspace.jaffnatemples;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;

import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import android.widget.TextView;




@SuppressLint("CutPasteId")
public class Db_results<LayoutInfalter> extends Activity {



    /**
	 * @uml.property  name="tAdapter"
	 * @uml.associationEnd  inverse="this$0:lk.adspace.jaffnatemples.Db_results$Temple_Adapter"
	 */
    Temple_Adapter tAdapter;

    /**
	 * @uml.property  name="temple_data"
	 */
    ArrayList<kovil> temple_data = new ArrayList<kovil>();
    /**
	 * @uml.property  name="temple_listview"
	 * @uml.associationEnd  readOnly="true"
	 */
    ListView temple_listview;
    /**
	 * @uml.property  name="dbhand"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    Dbhandler dbhand = new Dbhandler(this); 



                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.display_db_result);

                    
 
		   Dbhandler dbhand = new Dbhandler(this); 
		   
			
			
			
		   kovil insertData1 = new kovil("Nallur Kandaswamy Kovi", "Murugan", "9.676484",  "80.029721", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData2 = new kovil("SribalaKathirkamam ", "Murugan", "9.684691", "80.03603", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData3 = new kovil("Manchavanapathy Murugan ", "Murugan", "9.704996",  "80.013027", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData4 = new kovil("Navaly Sri Kathirkama Murugan ", "Murugan", "9.716502",  "79.987621", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData5 = new kovil("Nunavilkulam Murugan ", "Murugan", "9.678599",  "80.129757", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData6 = new kovil("Sri Murugan ", "Murugan", "9.664723",  "80.170269", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData7 = new kovil("Keerimalai Naguleswaram ", "Murugan", "9.818682",  "80.013056", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           
			
			
           kovil insertData8 = new kovil("Santhaiyar Madam Katpaga Vinayagar", "Vinayakar", "9.677584",  "80.011511", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData9 = new kovil("Muoththa Vinayagar", "Vinayakar", "9.674876",  "80.035543", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData10 = new kovil("Nallur Sacred Pandarakulam Vinayagar", "Vinayakar", "9.681307",  "80.034857", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData11 = new kovil("Santhaiyar Madam Katpaga Vinayagar", "Vinayakar", "9.677922",  "80.011854", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData12 = new kovil("Sri Sabapathy Vinayagar", "Vinayakar", "9.690952",  "80.015631", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData13 = new kovil("Potpathy Vinayagar", "Vinayakar", "9.698397",  "80.024042", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData14 = new kovil("Uyarapulam Uthungar Vinayagar", "Vinayakar", "9.706688",  "80.003271", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData15 = new kovil("Karipiran Athi Vinayagar", "Vinayakar", "9.70635",  "79.996748", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData16 = new kovil("Sinthamani Vinayagar", "Vinayakar", "9.71684",  "79.98559", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData17 = new kovil("Neeraviyadi Pillayar", "Vinayakar", "9.678261",  "80.015473", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData18 = new kovil("Panrikkoddu Pillaiyar", "Vinayakar", "9.678768",  "80.011439", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData19 = new kovil("Kaladdy Veerakaththy Pillayar", "Vinayakar", "9.685791",  "80.016074", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData20 = new kovil("Arasady Pillayar", "Vinayakar", "9.685706",  "80.013499", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData21 = new kovil("Kesavil Pillaiyar", "Vinayakar", "9.689672",  "80.011291", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData22 = new kovil("Kaathavaikkal Vinayakar", "Vinayakar", "9.663369",  "80.10252", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData23 = new kovil("Kollankitaai Vinayakar", "Vinayakar", "9.6654",  "80.135794", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData24 = new kovil("Manangunaai Veerakaththi Vinayakar", "Vinayakar", "9.669969",  "80.142145", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData25 = new kovil("Paralai Vinayakar", "Vinayakar", "9.793648",  "79.940529", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData26 = new kovil("Veerahathi Vinayagar", "Vinayakar", "9.827478",  "80.172615", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData27 = new kovil("vaththanai katpaka vinayakar", "Vinayakar", "9.843039",  "80.221367", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData28 = new kovil("Thampuruvalai Sri Siththi Vinayakar", "Vinayakar", "9.843715",  "80.248146", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData29 = new kovil("Madaththe Pillayar", "Vinayakar", "9.766581",  "79.949455", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData30 = new kovil("Sithankeni Pillayar", "Vinayakar", "9.771318",  "79.963188", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData31 = new kovil("Sri Nadaraja Mukkuruni Pillayar", "Vinayakar", "9.698905",  "80.039406", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           
			
			
			
			kovil insertData32 = new kovil("Pirappankulam Mahamari Amman", "Amman", "9.670815",  "80.041523", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData33 = new kovil("Kaladdy Amman", "Amman", "9.694505",  "80.015087", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData34 = new kovil("Veeramakali Amman", "Amman", "9.681984",  "80.02367", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData35 = new kovil("Panangkulam Nachchi Amman", "Amman", "9.68266",  "80.034657", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData36 = new kovil("Rajarajeswari Amman", "Amman", "9.678261",  "80.048046", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData37 = new kovil("Suthumalai Puvaneswary Amman", "Amman", "9.7253",  "80.000324", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData38 = new kovil("Kopay Kannaki Amman ", "Amman", "9.715487",  "80.061092", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData39 = new kovil("Ilanganayaki Amman", "Amman", "9.692136",  "80.04015", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData40 = new kovil("Naagapooshani Amman", "Amman", "9.713795",  "80.031567", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData41 = new kovil("Nunavilkulam Kannakai Amman", "Amman", "9.668784", "80.128727", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
			kovil insertData42 = new kovil("Pechchi Amman", "Amman", "9.663369",  "80.14246", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData43 = new kovil("Pandatharippu Amman", "Amman", "9.774025",  "79.963245", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData44 = new kovil("Veeniyavarai Rajarajeshwari Amman", "Amman", "9.796693",  "80.034657", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData45 = new kovil("Thoppu Meenadchi Amman", "Amman", "9.769626",  "80.113277", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData46 = new kovil("Puvaneswary Amman", "Amman", "9.801767",  "80.12289", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData47 = new kovil("Muththumari Amman", "Amman", "9.659308",  "80.157223", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData48 = new kovil("Siva Maha Kaali Amman", "Amman", "9.704658",  "80.029163", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData49 = new kovil("Inuvil Sivagami Amman", "Amman", "9.717179",  "80.026417", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData50 = new kovil("Kannaki Amman", "Amman", "9.721239",  "80.02161", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData51 = new kovil("Kazlaiyoddai Kannaki Amman", "Amman", "9.717179",  "79.976292", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
			kovil insertData52 = new kovil("Thuvali Amman", "Amman", "9.798722",  "80.167179", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData53 = new kovil("Karuppayady Manonmani amman", "Amman", "9.788911",  "80.175762", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData54 = new kovil("Kannaraiyampathy Rajeswary Amman", "Amman", "9.7544",  "80.114651", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData55 = new kovil("Veeniyavarai Rajarajeshwari Amman", "Amman", "9.796016",  "80.034657", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData56 = new kovil("Evenai Meenaddchi amman", "Amman", "9.760491",  "80.076885", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData57 = new kovil("Manthikai Kannakai Amman", "Amman", "9.808195",  "80.224514", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData58 = new kovil("Vevilanthy Muthumari", "Amman", "9.819697",  "80.211124", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           
			kovil insertData59 = new kovil("Nunavilkulam Murugan", "Murugan", "9.667769",  "80.130043", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData60 = new kovil("Murugan Kovil", "Murugan", "9.675892", "80.159569", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData61 = new kovil("Alady Murugan", "Murugan", "9.650846",  "80.23716", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData62 = new kovil("Murugan Koyil, Kudathanai", "Murugan", "9.745603",  "80.272179", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData63 = new kovil("Puthukkulam Murugan", "Murugan", "9.782821",  "80.201454", "image_name", "year_build", "address", "city", "email", "website", "telephone1", "telephone2",  "Description");
           kovil insertData64 = new kovil("Pulavaravodai Puliyadi Veddai Murugan", "Murugan", "9.80921",  "80.198708", "image_name2", "year_build2", "address2", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           kovil insertData65 = new kovil("Nelliady Murugan ", "Murugan", "9.802444",  "80.199394", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
			kovil insertData66 = new kovil("Paralai Murugan ", "Murugan", "9.799737",  "79.941788", "image_name3", "year_build3", "address3", "city2", "email2", "website2", "telephone12", "telephone22",  "Description2");
           
			
		   
		   
		   
		   
		   
            
            
            
            ArrayList<kovil> arrayList = new ArrayList<kovil>();
                     
            arrayList.add(insertData1); 
            arrayList.add(insertData2); 
            arrayList.add(insertData3);           
            arrayList.add(insertData4);
            arrayList.add(insertData5);
            arrayList.add(insertData6);
            arrayList.add(insertData7);
            arrayList.add(insertData8);
            arrayList.add(insertData9);
            arrayList.add(insertData10);
            arrayList.add(insertData11);
            arrayList.add(insertData12);
            arrayList.add(insertData13);
            arrayList.add(insertData14);
            arrayList.add(insertData15);
            arrayList.add(insertData16);
            arrayList.add(insertData17);
            arrayList.add(insertData18);
            arrayList.add(insertData19);
            arrayList.add(insertData20);
            arrayList.add(insertData21);
            arrayList.add(insertData22);
            arrayList.add(insertData23);
            arrayList.add(insertData24);
            arrayList.add(insertData25);
            arrayList.add(insertData26);
            arrayList.add(insertData27);
            arrayList.add(insertData28);
            arrayList.add(insertData29);
            arrayList.add(insertData30);
            arrayList.add(insertData31); 
            arrayList.add(insertData32); 
            arrayList.add(insertData33);           
            arrayList.add(insertData34);
            arrayList.add(insertData35);
            arrayList.add(insertData36);
            arrayList.add(insertData37);
            arrayList.add(insertData38);
            arrayList.add(insertData39);
            arrayList.add(insertData40);
            arrayList.add(insertData41);
            arrayList.add(insertData42);
            arrayList.add(insertData43);
            arrayList.add(insertData44);
            arrayList.add(insertData45);
            arrayList.add(insertData46);
            arrayList.add(insertData47);
            arrayList.add(insertData48);
            arrayList.add(insertData49);
            arrayList.add(insertData50);
            arrayList.add(insertData51);
            arrayList.add(insertData52);
            arrayList.add(insertData53);
            arrayList.add(insertData54);
            arrayList.add(insertData55);
            arrayList.add(insertData56);
            arrayList.add(insertData57);
            arrayList.add(insertData58);
            arrayList.add(insertData59);
            arrayList.add(insertData60);
            arrayList.add(insertData61);
            arrayList.add(insertData62);
            arrayList.add(insertData63);
            arrayList.add(insertData64);
            arrayList.add(insertData65);
            arrayList.add(insertData66);
            
            
            
            
            
           int totaltemple = dbhand.Get_Total_Temple();
            
           Toast.makeText(this, "Total Temple in DB = "+ totaltemple, Toast.LENGTH_SHORT).show();
            
            
            if(totaltemple==0){
            for (int i=0; i<arrayList.size(); i++){
                dbhand.Add_Temple(arrayList.get(i));
            };
            }else{}
            
            

            
            TextView tv1 = (TextView) findViewById(R.id.from1);
    		tv1.setText(getIntent().getExtras().getString("from"));
    		
    		final TextView tv2 = (TextView) findViewById(R.id.distance);
    		tv2.setText(getIntent().getExtras().getString("distance"));
    		
    		final TextView tv3 = (TextView) findViewById(R.id.templetype);
    		tv3.setText(getIntent().getExtras().getString("temple_type"));
    		
    		final TextView tv4 = (TextView) findViewById(R.id.nooftemples);
    		tv4.setText(getIntent().getExtras().getString("notemples"));
            
            
           
                // collecting values from DB       
            TextView result = (TextView) findViewById(R.id.textviewres);
            
            result.setText(dbhand.collect(
            		getIntent().getExtras().getString("temple_type"), 
            		getIntent().getExtras().getString("notemples"))
            		);

            
            
            
            


		


                      
            
            
          final TextView latlong = (TextView) findViewById(R.id.latlong);
            
            
          LocationManager manager = (LocationManager) this .getSystemService(Context.LOCATION_SERVICE); 
          Location loc =   manager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
       
          
          latlong.setText("My Current location \n Latitude = "+ loc.getLatitude()+" \n Longitude = "+ loc.getLongitude());
          

            
                            
                            
            Button but = (Button) findViewById(R.id.button1);
			but.setOnClickListener(new OnClickListener() {
				
			@Override
			public void onClick(View v) {
				
				Intent intent4 = new Intent(Db_results.this, Viewmap.class);
				intent4.putExtra("distance", tv2.getText().toString());
				intent4.putExtra("temple_type", tv3.getText().toString());
				intent4.putExtra("notemples", tv4.getText().toString());

				startActivity(intent4);
				
				}
			});     
                            
                            

                }



//                public void View_all_temples(){
//
//                	System.out.print("iNTO View_all_temples STAGE 1");
//                    //temple_data.clear();
//                    
//                    ArrayList<kovil> temple_array_from_db = dbhand.Get_Temple();
//                    System.out.print("CALLED View_all_temples");
//                    for (int i = 0; i < temple_array_from_db.size(); i++) {
//                    	
//                    	System.out.print("INTO LOOP");
//                    	
//                        int tidno = temple_array_from_db.get(i).getID();
//                        String tempname = temple_array_from_db.get(i).gettemplename();
//                        String city = temple_array_from_db.get(i).getcity();
//                        String telphon = temple_array_from_db.get(i).gettelephone1();
//                        kovil kov = new kovil();
//                        kov.setID(tidno);
//                        kov.settemplename(tempname);
//                        kov.setcity(city);
//                        kov.settelephone1(telphon);
//
//                        temple_data.add(kov);
//                        
//                        
//                    }
//                    dbhand.close();
//                    //tAdapter = new Temple_Adapter(Db_results.this, R.layout.display_db_result,temple_data);
//                    //tAdapter = new Temple_Adapter(Db_results.this, R.layout.display_db_result);
//                    //temple_listview.setAdapter(tAdapter);
//                    tAdapter.notifyDataSetChanged();
//
//
//                }

        

                /**
				 * @author  baman
				 */
                public class Temple_Adapter extends ArrayAdapter<kovil> {
     
                	Activity activity;
                    int layoutResourceId;
                    /**
					 * @uml.property  name="user"
					 * @uml.associationEnd  
					 */
                    kovil user;
                    LayoutInfalter mInfalter;    
                    ArrayList<kovil> data = new ArrayList<kovil>();
                    /**
					 * @uml.property  name="holder"
					 * @uml.associationEnd  
					 */
                    ViewHolder holder; 
                    public Temple_Adapter(Context act,
							int layoutResourceId,  ArrayList<kovil> data) {
                  	super(act,layoutResourceId,data);
                  	tAdapter = new Temple_Adapter(Db_results.this, R.layout.display_db_result,temple_data);
                    this.layoutResourceId = layoutResourceId;
                    this.activity = (Activity) act;
                    this.data = data;

					}
                    
                    

                    @SuppressWarnings({ "unchecked", "null" })
					public View getView(int position, View convertView, ViewGroup parent) { 
                       

		                        if (convertView == null) { 
		                            LayoutInflater mInflater = null;
									convertView = mInflater.inflate(R.layout.display_db_result,parent, false);
		                            holder = new ViewHolder(); 
		                            holder.tv = (TextView) convertView.findViewById(R.id.from1);
		                            convertView.setTag(holder);  // set tag on view
		                       } else { 
		                           holder = (ViewHolder) convertView.getTag();
		                       } 
		
		                       holder.tv.setText((CharSequence) data.get(position).temple_name);
		                       return convertView; 
                    }
	                  public class ViewHolder
	                   {
	                        TextView tv;
	                   }
 
                    
                    
                }
                
                
                @Override
                public boolean onCreateOptionsMenu(Menu menu) {
                    // Inflate the menu; this adds items to the action bar if it is present.
                    getMenuInflater().inflate(R.menu.main, menu);
                    return true;
                }


				/**
				 * @uml.property  name="viewmap"
				 * @uml.associationEnd  inverse="db_results:lk.adspace.jaffnatemples.Viewmap"
				 */
				private Viewmap viewmap;



				/**
				 * Getter of the property <tt>viewmap</tt>
				 * @return  Returns the viewmap.
				 * @uml.property  name="viewmap"
				 */
				public Viewmap getViewmap() {
					return viewmap;
				}


				/**
				 * Setter of the property <tt>viewmap</tt>
				 * @param viewmap  The viewmap to set.
				 * @uml.property  name="viewmap"
				 */
				public void setViewmap(Viewmap viewmap) {
					this.viewmap = viewmap;
				}

            }













