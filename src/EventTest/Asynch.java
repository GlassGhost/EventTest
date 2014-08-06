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

//6 Things needed in a class file to catch & receive events in a class:

import java.util.*;//import of java.util.event

//Declaration of the event's interface type, OR import of the interface,
//OR declared somewhere else in the package
interface ThrowListener {
	public void Catch();
}
/*________________________________________________________________*/class Asynch
implements ThrowListener {//implement added to class
//Set of functions that Catch Events
	@Override public void Catch() {
		System.out.println("I caught something!!");
	}

//list of catchers & corresponding function to add/remove them in the list
	List<ThrowListener> listeners = new ArrayList<ThrowListener>();
	public void addThrowListener(ThrowListener toAdd){ listeners.add(toAdd); }
	public void removeThrowListener(ThrowListener toRemove){ listeners.remove(toRemove); }
	//Set of functions that Throw Events.
		public void Throw() { for (ThrowListener hl : listeners) hl.Catch();
			System.out.println("Something thrown");
		}
}

