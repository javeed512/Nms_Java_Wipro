package observer;

public class ObserverPatternTest {
	
		public static void main(String[] args) {
			
		
	
		MyTopic topic = new MyTopic();
	
	
	//create observers
			Observer obj1 = new MyTopicSubscriber("Obj1");
			Observer obj2 = new MyTopicSubscriber("Obj2");
			Observer obj3 = new MyTopicSubscriber("Obj3");
			
			//register observers to the subject
			topic.register(obj1);
			topic.register(obj2);
			topic.register(obj3);
			
			
			//attach observer to subject
			obj1.setSubject(topic);
			obj2.setSubject(topic);
			obj3.setSubject(topic);
			
			obj1.update(); // check before publish no update/msg
			
			
			topic.postMessage("New Video updated please watch"); // publish and automatic notify all observers
			
			System.out.println("Observer who is watching");
			obj1.update(); // checking after publish get msg/update
			obj3.update();
		}

}
