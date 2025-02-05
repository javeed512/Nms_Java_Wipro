package observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{  //Publisher
	

	private List<Observer> observersList;
	private String message;
	private boolean changed;
	
	public MyTopic() {
		
		observersList = new ArrayList<Observer>();
		
		
	}

	@Override
	public void register(Observer obj) {

		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (this) {
		if(!observersList.contains(obj))
			observersList.add(obj);
		}
		
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (this) {
			observersList.remove(obj);
			}
		
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (this) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.observersList);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

		
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	
	//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("Message Posted to Topic:"+msg);
			this.message=msg;
			this.changed=true;
			notifyObservers();
		}

	
	

}
