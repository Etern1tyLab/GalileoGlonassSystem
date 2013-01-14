
public class MessageStorage {

	String imei;
	int latitude;
 	int longitude;
    int speed;
    int height;  
    int hdop;
    int pwr_ext;
    int pwr_int;
    int adc1;
    int adc2;
    int sats;
	
	
	
	public MessageStorage(String imei, int latitude, int longitude, int speed,
			int height, int hdop, int pwr_ext, int pwr_int, int adc1, int adc2,
			int sats) {
		
		this.imei = imei;
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.height = height;
		this.hdop = hdop;
		this.pwr_ext = pwr_ext;
		this.pwr_int = pwr_int;
		this.adc1 = adc1;
		this.adc2 = adc2;
		this.sats = sats;
		
	}
	
	
	public String getImei (){
  	  String getImei = imei;
    return getImei;}
    
    
    public int getLat (){
    	int getLat = latitude;
    return getLat;}
    
    
    public int getLon (){
    	int getLon = longitude;
    return getLon;}
    
    
    public int getSpeed (){
  	  int getSpeed = speed;
    return getSpeed;}
    
    
    public int getHeight (){
  	  int getHeight = height;
    return getHeight;}
    
    
    public int getHdop (){
    	int getHdop = hdop;
    return getHdop;}
    
    
    public int getPwr_ext (){
    	int getPwr_ext = pwr_ext;
    return getPwr_ext;}
    
    
    public int getAdc1 (){
    	int getAdc1 = adc1;
    return getAdc1;}
    
    
    public int getPwr_int (){
    	int getPwr_int = pwr_int;
    return getPwr_int;}
    
    
    public int getAdc2 (){
    	int getAdc2 = adc2;
    return getAdc2;}
    
    
    public int getSats (){
  	  int getSats = sats;
    return getSats;}
	


}
