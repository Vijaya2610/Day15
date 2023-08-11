package functional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;


public class EvalutateFeedback {
	
	ArrayList<CallQualityFeedBack> itemlist=new ArrayList();
	
	EvalutateFeedback()
	{
		itemlist.add(new CallQualityFeedBack(1,"1234","good",1));
		itemlist.add(new CallQualityFeedBack(2,"1224","poor",5));
		itemlist.add(new CallQualityFeedBack(3,"1234","better",4));
		itemlist.add(new CallQualityFeedBack(4,"1244","excellent",3));
		
	}
	public void forEach(Consumer<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:itemlist) {
			c.accept(i);
		}
	}
	public void forEach(Predicate<CallQualityFeedBack> c1) {
		for(CallQualityFeedBack i:itemlist) {
			if(c1.test(i))
			{
				System.out.println(i+"\n Call quality is good");
			}
			else
			{
				System.out.println(i+"\n Call quality is bad");
			}
			
		}
	}


	public static void main(String[] args) {
		EvalutateFeedback obj=new EvalutateFeedback();
		obj.forEach((c)->System.out.println(c));
		obj.forEach((c1)->c1.getRating()>3);

	}

}
