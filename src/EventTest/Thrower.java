/*_______________________________________________________________________License
	Copyright © 2014 Roy Pfund

	Licensed under the Apache License, Version 2.0 (the  "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable  law  or  agreed  to  in  writing,
	software distributed under the License is distributed on an  "AS
	IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either
	express or implied. See the License for  the  specific  language
	governing permissions and limitations under the License.
____________________________________________________________*/package EventTest;
//Creating and using Your own custom events in Java.

//4 Things needed in a class file to send events to a class:

import java.util.*;//import of java.util.event

//Declaration of the event's interface type, OR import of the interface,
//OR declared somewhere else in the package
interface ThrowListener {
	public void Catch();
}
/*_____________________________________________________________*/class Thrower {
//list of catchers & corresponding function to add/remove them in the list
	List<ThrowListener> listeners = new ArrayList<ThrowListener>();
	public void addThrowListener(ThrowListener toAdd){ listeners.add(toAdd); }
	//Set of functions that Throw Events.
		public void Throw(){ for (ThrowListener hl : listeners) hl.Catch();
			System.out.println("Something thrown");
		}
////Optional: 2 things to send events to a class that is a member of the current class
////instantiation of a Catcher object
//	static Catcher CatcherInstance = new Catcher();
//	public Thrower(){
////addListener CatcherInstance to this Thrower
//		this.addThrowListener(CatcherInstance);
////let's trigger an event to see if it works!
//		this.Throw();
//	}
//	public static void main(String[] args) {
//		new Thrower();
//	}
}
