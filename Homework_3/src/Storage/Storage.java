package Storage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import Base.IBus;

import java.util.HashMap;
import java.util.Map;

public class Storage {

	List<IBus> listPublicBuses;
	List<IBus> listSchoolBuses;
	
	Set<IBus> setOfTouristBuses;
	
	Map<String, IBus> freightBusesMap;
	
	public Storage() {
		listPublicBuses  = new ArrayList<IBus>();
		listSchoolBuses  = new LinkedList<IBus>();
		
		setOfTouristBuses = new HashSet<IBus>();
		
		freightBusesMap  = new HashMap<>();
	}
	
	
	// PublicBus - ArrayList
	public void setPublicBus(IBus bus) {
		listPublicBuses.add(bus);
	}
	
	public void removePublicBus(int index) {
		listPublicBuses.remove(index);
	}
	
	public List<IBus> getListPublicBuses(){
		return listPublicBuses;
	}
	
	// SchoolBus - LinkedList
	public void setSchoolBus(IBus bus) {
		listSchoolBuses.add(bus);
	}
	
	public void removeSchoolBus(int index) {
		listSchoolBuses.remove(index);
	}
	
	public List<IBus> getListSchoolBuses(){
		return listSchoolBuses;
	}
	
	
	// TouristBus - HashSet
	public void setTouristBus(IBus bus) {
		setOfTouristBuses.add(bus);
	}
	
	public void removeTouristBus(IBus bus) {
		setOfTouristBuses.remove(bus);
	}
		
	public Set<IBus> getSetOfTourist() {
		return setOfTouristBuses;
	}
	
	
	// FreightBus - HashMap
	public void setFreightBus(String label, IBus bus) {
		freightBusesMap.put(label, bus);
	}
	
	public void removeFreightBus(String label) {
		freightBusesMap.remove(label);
	}
		
	public Map<String, IBus> getMapFreightBus() {
		return freightBusesMap;
	}
}