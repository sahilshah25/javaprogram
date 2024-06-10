package ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		YoutubeChannel channel=new YoutubeChannel();
		
		Subscriber sahil=new Subscriber("sahil");
		Subscriber ahmad=new Subscriber("ahmad");
	
		channel.Subscribe(sahil);
		 
		channel.Subscribe(ahmad);
		channel.Unsubscribe(ahmad);
		
		
		channel.NewVideoUploaded("learn design pattern");
		channel.NewVideoUploaded("java tut");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("pree 1 for upload video");
			System.out.println("press 2 create new subscriber");
			System.out.println("press 3 for unsubscibing your channel ");
			System.out.println("press 4 for exit");
			
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				System.out.println("enter video title");
				String vititle=br.readLine();
				channel.NewVideoUploaded(vititle);
				
			}
			else if(c==2) {
				
				System.out.println("enter the name of susbscriber ");
				String subname=br.readLine();
				Subscriber sub3=new Subscriber(subname);
				channel.Subscribe(sub3);
			}
			else if(c==3) {
				System.out.println("enter the name of unsubscriber");
				String unsubname=br.readLine();
				Unsubscriber un=new Unsubscriber(unsubname);
				channel.Unsubscribe(un);
				
				
				
			}
			else if(c==4) {
				System.out.println("thank yu for using");
				break;
				
			}
			else {
				System.out.println("wrong input");
				
			}
			
		}
		
		
		
	}

}
