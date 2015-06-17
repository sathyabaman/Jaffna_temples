package lk.adspace.jaffnatemples;






public class kovil {

    //public variables
    /**
	 * @uml.property  name="_id"
	 */
    public int _id;
    /**
	 * @uml.property  name="_temple_name"
	 */
    public String _temple_name;
    /**
	 * @uml.property  name="_temple_type"
	 */
    public String _temple_type;
    /**
	 * @uml.property  name="_latitude"
	 */
    public String _latitude;
    /**
	 * @uml.property  name="_longitude"
	 */
    public String _longitude;
    /**
	 * @uml.property  name="_image_name"
	 */
    public String _image_name;
    /**
	 * @uml.property  name="_year_build"
	 */
    public String _year_build;
    /**
	 * @uml.property  name="_address"
	 */
    public String _address;
    /**
	 * @uml.property  name="_city"
	 */
    public String _city;
    /**
	 * @uml.property  name="_email"
	 */
    public String _email;
    /**
	 * @uml.property  name="_website"
	 */
    public String _website;
    /**
	 * @uml.property  name="_telephone1"
	 */
    public String _telephone1;
    /**
	 * @uml.property  name="_telephone2"
	 */
    public String _telephone2;
    /**
	 * @uml.property  name="_Description"
	 */
    public String _Description;
	/**
	 * @uml.property  name="temple_name"
	 */
	public Object temple_name;

    //empty constructor
    public kovil (){

    }


    // int id, String temple_name, String temple_type, String latitude,  String longitude, String image_name, String year_build, String address, String city, String email, String website, String telephone1, String telephone2,  String Description


    public kovil(int id, String temple_name, String temple_type, String latitude,  String longitude, String image_name, String year_build, String address, 
            String city, String email, String website, String telephone1, String telephone2,  String Description) {
        // TODO Auto-generated constructor stub



          this._id= id;
          this._temple_name=temple_name;
          this._temple_type=temple_type;
          this._latitude=latitude;
          this._longitude=longitude;
          this._image_name=image_name;
          this._year_build=year_build;
          this._address=address;
          this._city=city;
          this._email=email;
          this._website=website;
          this._telephone1=telephone1;
          this._telephone2=telephone2;
          this._Description=Description;

    }



    public kovil(String temple_name, String temple_type, String latitude,  String longitude, String image_name, String year_build, String address, 
            String city, String email, String website, String telephone1, String telephone2,  String Description) {
        // TODO Auto-generated constructor stub

          this._temple_name=temple_name;
          this._temple_type=temple_type;
          this._latitude=latitude;
          this._longitude=longitude;
          this._image_name=image_name;
          this._year_build=year_build;
          this._address=address;
          this._city=city;
          this._email=email;
          this._website=website;
          this._telephone1=telephone1;
          this._telephone2=telephone2;
          this._Description=Description;

    }


            public int getID() {
            return this._id;
            }


            public void setID(int id) {
            this._id = id;
            }


            public String gettemplename() {
            return this._temple_name;
            }


            public void settemplename(String temple_name) {
            this._temple_name=temple_name;
            }

            public String gettempletype() {
            return this._temple_type;
            }


            public void settempletype(String temple_type) {
            this._temple_type=temple_type;
            }

            public String getlatitude() {
            return this._latitude;
            }


            public void setlatitude(String latitude) {
                this._latitude=latitude;
            }

            public String getlongitude() {
            return this._longitude;
            }


            public void setlongitude(String longitude) {
                this._longitude=longitude;
            }


            public String getimage_name() {
            return this._image_name;
            }


            public void setimage_name(String image_name) {
                this._image_name=image_name;
            }

            public String getyear_build() {
            return this._year_build;
            }


            public void setyear_build(String year_build) {
                this._year_build=year_build;
            }


            public String getaddress() {
            return this._address;
            }


            public void setaddress(String address) {
                this._address=address;
            }

            public String getcity() {
            return this._city;
            }


            public void setcity(String city) {
                this._city=city;
            }


            public String getemail() {
            return this._email;
            }


            public void setemail(String email) {
                this._email=email;
            }


            public String getwebsite() {
            return this._website;
            }


            public void setwebsite(String website) {
                this._website=website;
            }


            public String gettelephone1() {
            return this._telephone1;
            }


            public void settelephone1(String telephone1) {
                this._telephone1=telephone1;
            }

            public String gettelephone2() {
            return this._telephone2;
            }


            public void settelephone2(String telephone2) {
                this._telephone2=telephone2;
            }


            public String getDescription() {
            return this._Description;
            }


            public void setDescription(String Description) {
                this._Description=Description;
            }


}