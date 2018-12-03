import java.io.*;
import java.util.Scanner;

public class HotelBill {
	
	String filename;
	Hotel hotel;
	private static int MAX_NUMBER_OF_HOTEL_SUITES=3;
	private static int MAX_NUMBER_OF_BED_ROOMS=5;
	
	public HotelBill(java.lang.String filename) {
		this.filename = filename;
	}
	
	public int getCost(){
		if(hotel==null) {
			return -1;
		}
		else {
			return hotel.getHotelCost();
		}
	}
	
	public int readContent() {
		
		BufferedReader br;
		int numsuites=0;
		HotelSuite suites[] = new HotelSuite[MAX_NUMBER_OF_HOTEL_SUITES];
		
		try {
			br = new BufferedReader(new InputStreamReader( new FileInputStream(filename)));
		} catch(FileNotFoundException e) {
			System.out.println(e.toString());
			return -1;
		}
		
		try {
			BedRoom bedrooms[] = new BedRoom[MAX_NUMBER_OF_BED_ROOMS];
			WashRoom w = new WashRoom(0,0,0);
			LivingRoom l = new LivingRoom(0,0,0);
			int brnums=0;
			
			do {
				
				String t = br.readLine();
				if(t==null) {
					break;
				}
				String pieces[] = t.split(":");
				//System.out.println(pieces[0]);
				
				if(pieces[0].equals("HotelSuite"))
				{
					if(numsuites>0) {
						bedrooms = new BedRoom[MAX_NUMBER_OF_BED_ROOMS];
						brnums=0;
					}
					numsuites++;
				}
				else if(pieces[0].equals("Room")) {
					String[] roomdetails = pieces[1].split(",");
					int len = Integer.parseInt(roomdetails[1]);
					int wid = Integer.parseInt(roomdetails[2]);
					int hig = Integer.parseInt(roomdetails[3]);
					
					if(roomdetails[0].equals("br")) {
						bedrooms[brnums++] = new BedRoom(len, wid, hig);
						
					}
					else if(roomdetails[0].equals("wr")) {
						w = new WashRoom(len, wid, hig);
					}
					else if(roomdetails[0].equals("lr")) {
						l = new LivingRoom(len, wid, hig);
					}
					//System.out.println(brnums);
					suites[numsuites-1] = new HotelSuite(w, l, bedrooms);
				}
			} while(true);
			
			this.hotel = new Hotel(suites);
			
		} 
		catch(IOException e) {
			System.out.println(e.toString());
			return -1;
		}

		try {
			br.close();
		} catch(IOException e) {
			System.out.println(e.toString());
			return -1;
		}
		
		//System.out.println(numsuites);
		return numsuites;
	}
	
	public void writeResult(java.lang.String content) throws IOException {
		
		BufferedWriter bw;
		
		try {
			bw = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(filename,true)));
			//System.out.println("hello");
			bw.append("\n");
			bw.append(content);
			
			bw.close();
			
		} catch(FileNotFoundException e) {
			//System.out.println(e.toString());
		}
		catch(IOException e) {
			//System.out.println(e.toString());
		}
		
	}
	
	public static void main(java.lang.String[] args){
		try {
			Scanner conin = new Scanner(System.in);
			String fname = conin.nextLine();
			//System.out.println(fname);
			HotelBill hb = new HotelBill(fname);
			//System.out.println(hb.getCost());
			int n = hb.readContent();
			String res = "Total:"+n+","+Integer.toString(hb.getCost());
			System.out.println(res);
			hb.writeResult(res);
			conin.close();
		}
		catch(IOException e){
			//System.out.println(e.toString());
		}
		
	
	}
}
