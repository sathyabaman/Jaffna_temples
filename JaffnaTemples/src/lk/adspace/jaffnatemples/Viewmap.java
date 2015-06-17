package lk.adspace.jaffnatemples;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Dialog;

import android.graphics.Color;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import android.view.Menu;
import android.widget.Toast;


import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class Viewmap extends FragmentActivity implements 
GooglePlayServicesClient.ConnectionCallbacks,




GooglePlayServicesClient.OnConnectionFailedListener {

	private static final int GPS_ERRORDIALOG_REQUEST = 9001;
	/**
	 * @uml.property  name="mMap"
	 * @uml.associationEnd  
	 */
	GoogleMap mMap;
	

			
			
	private static final double SEATTLE_LAT = 9.663216;
	private static final double SEATTLE_LNG =80.01333;
	private static final float DEFAULTZOOM = 15;
	
	static final double _eQuatorialEarthRadius = 6378.1370D;
    static final double _d2r = (Math.PI / 180D);
	/**
	 * @uml.property  name="mLocationClient"
	 * @uml.associationEnd  readOnly="true"
	 */
	LocationClient mLocationClient;
	/**
	 * @uml.property  name="markers"
	 */
	ArrayList<Marker> markers = new ArrayList<Marker>();
	static final int POLYGON_POINTS = 10;
	/**
	 * @uml.property  name="shape"
	 * @uml.associationEnd  readOnly="true"
	 */
	Polygon shape;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Dbhandler dbhand = new Dbhandler(this); 

		if (servicesOK()) {
			setContentView(R.layout.view_map);

			if (initMap()) {
				Toast.makeText(this, "Ready to map!", Toast.LENGTH_SHORT).show();
				gotoLocation(SEATTLE_LAT, SEATTLE_LNG, DEFAULTZOOM);
				
				
				
				// adding the moclocation of the user
				MarkerOptions marker = new MarkerOptions().position(new LatLng(SEATTLE_LAT, SEATTLE_LNG)).title("Jaffna Clock Tower");
				marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE));
				mMap.addMarker(marker);
				
	
		
				
				
//				ArrayList<kovil> data = dbhand.Get_Temple(getIntent().getExtras().getString("temple_type"), Integer.parseInt(getIntent().getExtras().getString("notemples")));
//
//
//					for (kovil temple: data) {
//						displaymarkers(Double.parseDouble(temple.getlatitude()), Double.parseDouble(temple.getlongitude()),  temple.gettemplename());
//					
//					}
				
				
				
				
				
				
//				ArrayList<kovil> kovil = dbhand.Get_Temple((getIntent().getExtras().getString("temple_type")), Integer.parseInt(getIntent().getExtras().getString("notemples")));
//				
//				
//				for (int i=0; i< Integer.parseInt(getIntent().getExtras().getString("notemples"));i++) {
//					
//							kovil kovil1 = dbhand.Get_Temple(i);
//							
//							String tempname = kovil1.gettemplename();
//							double latitude = Double.parseDouble(kovil1.getlatitude());
//							double longitude = Double.parseDouble(kovil1.getlongitude());
//							displaymarkers(latitude,longitude, tempname);
//				}
//			
//				
//				
//				

				
				
				String array[][]=dbhand.collecting(getIntent().getExtras().getString("temple_type"), Integer.parseInt(getIntent().getExtras().getString("notemples")));
				
				
				
				

				
				//Drawing markers on map
				
				
//				for(int i=0;i<array.length;i++){
//					
//				displaymarkers(Double.parseDouble(array[i][0]), Double.parseDouble(array[i][1]), array[i][2]);
//				}
//				

				
				
				
				// geting the values depending on the distance and shorting it
				
				double userdistance = Double.parseDouble(getIntent().getExtras().getString("distance"));
				
				DistanceInfo[] distancearray = new DistanceInfo[array.length];
				
				for (int i = 0; i < array.length; i++) {
					
					double Distance = HaversineInM(SEATTLE_LAT, SEATTLE_LNG, Double.parseDouble(array[i][0]), 
							Double.parseDouble(array[i][1]));
					
					Toast.makeText(this, "DISTANCE = "+Distance+" M", Toast.LENGTH_SHORT).show();
					
					if((userdistance*1000) >= Distance){
						
					double a = Double.parseDouble(array[i][0]);
				    double b = Double.parseDouble(array[i][1]);

				    distancearray[i] = new DistanceInfo(a, b, Distance);
				    
				   }else{
					   // if the distance is grater than users specified distance. then add 0 to its value.
					   // then in draw polygon function check if there is any array containg value 0 and ignore it.
					    double a = 0;
					    double b = 0;

					    distancearray[i] = new DistanceInfo(a, b, Distance);
				   }
				}
				
				
				// arranging the temple depending on the distance
				
				Arrays.sort(distancearray, null);
				
		
				
				//Drawing polygon
				
				drawpolygon(distancearray);
				
				
				
				// Setting markers on the map
						for(int i=0;i<array.length;i++){
							
							
						double Distance2 = HaversineInM(SEATTLE_LAT, SEATTLE_LNG, Double.parseDouble(array[i][0]), Double.parseDouble(array[i][1]));
						
								if((userdistance*1000) >= Distance2){
								
								displaymarkers(Double.parseDouble(array[i][0]), Double.parseDouble(array[i][1]), array[i][2]);
								
								}else {}
						
						}	

				
				
				

				// drawing Circle
			
				int radius = Integer.parseInt(getIntent().getExtras().getString("distance"));
				
				drawcircle(radius);
					
					
				
			}
			else {
				Toast.makeText(this, "Map not available!", Toast.LENGTH_SHORT).show();
			}
		}
		else {
			setContentView(R.layout.main);
		}
		
				

	}
	
	
	

	// Drawing polygon on map
	
	private void drawpolygon(DistanceInfo  array[]) {

		int lengh = array.length;
		PolygonOptions poly = new PolygonOptions();
		poly.fillColor(Color.TRANSPARENT);
		//poly.fillColor(0x7F00FF00);
		// Initial point
		poly.add(new LatLng(9.6632139, 80.0133258));

			for(int i = 0; i < array.length; i++)
			{
						int checkvalue = (int)Math.round(array[i].a); 
						// cheching if there is any value with 0
						if(checkvalue > 0){
					    
							poly.add(new LatLng(array[i].a, array[i].b));
					    
						}else{	}
				
			}

		mMap.addPolygon(poly);

		}
	
	
	
	
	
	public void drawcircle(int rad){
		
		int value = rad*1000;
		
		 Circle circle = mMap.addCircle(new CircleOptions()
	     .center(new LatLng(9.663216, 80.01333))
	     .radius(value)
	     .strokeColor(Color.RED)
	     //.fillColor(Color.WHITE)
	     .fillColor(Color.TRANSPARENT));	
	}
	
	
	

	
	
	
	public boolean displaymarkers(double lati, double longi, String templename){
		
		MarkerOptions marker = new MarkerOptions().position(new LatLng(lati, longi)).title(templename);
		marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.icon));
		//marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
		mMap.addMarker(marker);
		
		
		return true;
	}
	
	


		
    public static int HaversineInM(double lat1, double long1, double lat2, double long2) {
        return (int) (1000D * HaversineInKM(lat1, long1, lat2, long2));
    }

    public static double HaversineInKM(double lat1, double long1, double lat2, double long2) {
        double dlong = (long2 - long1) * _d2r;
        double dlat = (lat2 - lat1) * _d2r;
        double a = Math.pow(Math.sin(dlat / 2D), 2D) + Math.cos(lat1 * _d2r) * Math.cos(lat2 * _d2r)
                * Math.pow(Math.sin(dlong / 2D), 2D);
        double c = 2D * Math.atan2(Math.sqrt(a), Math.sqrt(1D - a));
        double d = _eQuatorialEarthRadius * c;

        return d;
    }
	
		
		
	    
	    //This algorthym gives wrong result
		
		
	private double calculate_distance(double lat1, double lon1, double lat2, double lon2){	
			
		int R = 6370; // km
		double d = Math.acos(Math.sin(lat1)*Math.sin(lat2) + 
		              Math.cos(lat1)*Math.cos(lat2) *
		              Math.cos(lon2-lon1)) * R;
		return d;
		
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean servicesOK() {
		int isAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);

		if (isAvailable == ConnectionResult.SUCCESS) {
			return true;
		}
		else if (GooglePlayServicesUtil.isUserRecoverableError(isAvailable)) {
			Dialog dialog = GooglePlayServicesUtil.getErrorDialog(isAvailable, this, GPS_ERRORDIALOG_REQUEST);
			dialog.show();
		}
		else {
			Toast.makeText(this, "Can't connect to Google Play services", Toast.LENGTH_SHORT).show();
		}
		return false;
	}

	private boolean initMap() {
		if (mMap == null) {
			SupportMapFragment mapFrag =
					(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
			mMap = mapFrag.getMap();
		}
		return (mMap != null);
	}

	private void gotoLocation(double lat, double lng,
			float zoom) {
		LatLng ll = new LatLng(lat, lng);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(ll, zoom);
		mMap.moveCamera(update);
	}


	
	/*
	private Location getLastBestLocation() {
	    LocationManager mLocationManager = null;
		Location locationGPS = mLocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
	    Location locationNet = mLocationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);

	    long GPSLocationTime = 0;
	    if (null != locationGPS) { GPSLocationTime = locationGPS.getTime(); }

	    long NetLocationTime = 0;

	    if (null != locationNet) {
	        NetLocationTime = locationNet.getTime();
	    }

	    if ( 0 < GPSLocationTime - NetLocationTime ) {
	        return locationGPS;
	    }
	    else{
	        return locationNet;
	    }
	    }
	*/
	
	
	
	
	
	
	
	


	@Override
	public void onConnectionFailed(ConnectionResult arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void onConnected(Bundle arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void onDisconnected() {
		// TODO Auto-generated method stub
		
	}




	/**
	 * @uml.property  name="db_results"
	 * @uml.associationEnd  inverse="viewmap:lk.adspace.jaffnatemples.Db_results"
	 */
	private Db_results db_results;


	/**
	 * Getter of the property <tt>db_results</tt>
	 * @return  Returns the db_results.
	 * @uml.property  name="db_results"
	 */
	public Db_results getDb_results() {
		return db_results;
	}

	/**
	 * Setter of the property <tt>db_results</tt>
	 * @param db_results  The db_results to set.
	 * @uml.property  name="db_results"
	 */
	public void setDb_results(Db_results db_results) {
		this.db_results = db_results;
	}

	
	
	
	
	
}







class DistanceInfo implements Comparable<DistanceInfo> {
    public double a;
    public double b;
    public double distance;
    
    
    public DistanceInfo (double a, double b, double distance) {
        this.a = a; 
        this.b = b;
        this.distance = distance;
    }
    @Override public int compareTo (DistanceInfo d) { 
        return Double.compare(distance, d.distance);
    }
}



